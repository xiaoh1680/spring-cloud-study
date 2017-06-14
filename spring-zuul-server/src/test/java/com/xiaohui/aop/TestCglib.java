package com.xiaohui.aop;

import com.xiaohui.aop.cglib.BookFacadeCglib;
import com.xiaohui.aop.cglib.BookFacadeImpl;

/**
 * Created by 辉 on 2017/3/26.
 */
public class TestCglib {
    public static void main(String[] args) {
        BookFacadeCglib cglib=new BookFacadeCglib();
        BookFacadeImpl bookCglib=(BookFacadeImpl)cglib.getInstance(new BookFacadeImpl());
        bookCglib.addBook();
    }
}
