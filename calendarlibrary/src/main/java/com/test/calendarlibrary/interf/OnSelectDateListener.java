package com.test.calendarlibrary.interf;


import com.test.calendarlibrary.model.CalendarDate;

/**
 * Description : OnSelectDateListener
 *
 * @author Coco
 * @date 2021/9/1
 */

public interface OnSelectDateListener {
    void onSelectDate(CalendarDate date);

    void onSelectOtherMonth(int offset);//点击其它月份日期
}
