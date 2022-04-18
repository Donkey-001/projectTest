package com.wz.test.tt;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Donkey
 * Date: 2022/4/6
 * Time: 15:29
 */
@Data
public class TestEasyExcel {

    /**
     * 对应excel中的表头(第一行就是表头)
     */

    @ExcelProperty("学生姓名1")
    private String name;

    @ExcelProperty("学生姓名2")
    private String bName;

    @ExcelProperty("学生姓名3")
    private String cnAme;

    @ExcelProperty("学生姓名4")
    private String dnaMe;

    @ExcelProperty("学生姓名5")
    private String enamE;


}
