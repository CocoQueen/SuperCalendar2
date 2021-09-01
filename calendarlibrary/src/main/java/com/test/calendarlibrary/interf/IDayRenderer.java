package com.test.calendarlibrary.interf;

import android.graphics.Canvas;

import com.test.calendarlibrary.view.Day;


/**
 * Description : IDayRenderer
 *
 * @author Coco
 * @date 2021/9/1
 */
public interface IDayRenderer {

    void refreshContent();

    void drawDay(Canvas canvas, Day day);

    IDayRenderer copy();

}
