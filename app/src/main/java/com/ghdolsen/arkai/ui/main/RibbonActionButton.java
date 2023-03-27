package com.ghdolsen.arkai.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RibbonActionButton extends FloatingActionButton {

    private Drawable ribbonDrawable;

    public RibbonActionButton(Context context) {
        super(context);
    }

    public RibbonActionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RibbonActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener);
    }

    public void setRibbonDrawable(int drawableId) {
        ribbonDrawable = ContextCompat.getDrawable(getContext(), drawableId);
        updateRibbonDrawable();
    }

    private void updateRibbonDrawable() {
        if (ribbonDrawable != null) {
            setBackground(ribbonDrawable);
        }
    }
}

