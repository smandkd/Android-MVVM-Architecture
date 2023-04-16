package org.techtowm.observable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.DataBindingUtil;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.techtowm.observable.databinding.ActivityMainBinding;

@BindingMethods({
        @BindingMethod(
                type= ImageView.class,
                attribute="android:bgColor",
                method="setBackgroundColor"
        ),
})
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    //User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

      //  user.firstName.set("Charles");
      //  int age = user.age.get();


    }

    @BindingAdapter("android:paddingLeft")
    public static void setPaddingLeft(View view,int padding) {
        view.setPadding(
                padding,
                view.getPaddingTop(),
                view.getPaddingLeft(),
                view.getPaddingBottom()
        );
    }
}