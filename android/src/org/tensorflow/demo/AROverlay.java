package org.tensorflow.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;


import java.util.Objects;

/**
 * Created by suraj on 3/12/17.
 */

public class AROverlay {
    private Context context;
    private String[] labels = {"cup", "keyboard"};

    public AROverlay(final Context context){
        this.context = context;
    }

    public void drawAR(RectF rect, Canvas canvas, String label) {


        for (int i= 0; i < labels.length; i++) {
            System.out.println(label);
            if (Objects.equals(label, labels[i])) {
                int res_id = context.getResources().getIdentifier(label, "drawable", "org.tensorflow.demo");
                System.out.println(res_id);
                Drawable d = context.getResources().getDrawable(res_id);
                d.setBounds((int) rect.left, (int) rect.top, (int) rect.right, (int) rect.bottom);
                d.draw(canvas);

            }
        }

    }
}
