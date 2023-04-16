package org.techtowm.databindingcomponent;

import android.util.Pair;
import android.view.View;

import androidx.annotation.NonNull;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public class ClickBindingImpl implements ClickBinding, LifecycleEventObserver {

    private final PublishSubject<Pair<View, View.OnClickListener>>
    publishSubject = PublishSubject.create();

    @Override
    public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {

    }

    @Override
    public void setOnClickListener(View view, View.OnClickListener onClickListener) {

    }
}
