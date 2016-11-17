package com.example.user.brad05;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View {
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(100,100,40, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float ex = event.getX(), ey = event.getY();

        if (event.getAction() == MotionEvent.ACTION_DOWN){
            Log.v("brad", "DOWN:" +ex + " x " +ey);
        }else if (event.getAction() == MotionEvent.ACTION_MOVE){
            Log.v("brad", "MOVE:" +ex + " x " +ey);
        }

        return true;
    }
}
