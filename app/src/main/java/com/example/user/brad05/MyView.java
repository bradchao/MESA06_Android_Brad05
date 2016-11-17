package com.example.user.brad05;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.HashMap;
import java.util.LinkedList;

public class MyView extends View {
    private LinkedList<HashMap<String,Float>> line;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.BLACK);
        line = new LinkedList<>();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        //canvas.drawCircle(100,100,40, paint);

        

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float ex = event.getX(), ey = event.getY();

        if (event.getAction() == MotionEvent.ACTION_DOWN){
            touchDownTask(ex, ey);
        }else if (event.getAction() == MotionEvent.ACTION_MOVE){
            touchMoveTask(ex, ey);
        }
        return true;
    }
    private void touchDownTask(float ex, float ey){
        HashMap<String,Float> point = new HashMap<>();
        point.put("x", ex); point.put("y", ey);
        line.add(point);
    }
    private void touchMoveTask(float ex, float ey){
        HashMap<String,Float> point = new HashMap<>();
        point.put("x", ex); point.put("y", ey);
        line.add(point);
    }
}
