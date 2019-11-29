package com.example.huricanez;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Diagram extends View {
    Path sector = new Path();
    MainActivity activity;
    public Diagram(Context context) {
        super(context);
    }

    public Diagram(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        activity = (MainActivity) context;
        int sum= 0;
        for(int i =0; i< activity.mas1.length;i++){
            sum = sum + activity.mas1[i];
        }
        for(int i =0; i< activity.mas1.length;i++){
            activity.mas1[i]=activity.mas1[i]/sum *360;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // координаты середины экрана
        float w = canvas.getWidth(), h = canvas.getHeight();
        // создаём треугольный контур
        Paint p = new Paint();
        p.setColor(Color.BLUE);

        // отображаем контур на холсте
        canvas.drawPath(sector, p);
        for(int i=0; i<activity.mas1.length;i++){
            canvas.drawArc(0, 0, w, w ,0 ,activity.mas1[i], true, p);
        }

    }
}
