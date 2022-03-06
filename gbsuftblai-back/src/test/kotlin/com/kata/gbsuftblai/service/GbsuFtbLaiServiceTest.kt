package com.kata.gbsuftblai.service

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class GbsuFtbLaiServiceTest @Autowired constructor(val gbsuFtbLaiService: GbsuFtbLaiService) {

    @Test
    fun should_return_1_when_equals_1() {
        val result = gbsuFtbLaiService.convertNumber(1)
        Assertions.assertEquals("1", result);
    }

    @Test
    fun should_return_GbsuGbsu_when_equals_3() {
        val result = gbsuFtbLaiService.convertNumber(3)
        Assertions.assertEquals("GbsuGbsu", result);
    }

    @Test
    fun should_return_FtbFtb_when_equal_5() {
        val result = gbsuFtbLaiService.convertNumber(5)
        Assertions.assertEquals("FtbFtb", result);
    }

    @Test
    fun should_return_Lai_when_equal_7() {
        val result = gbsuFtbLaiService.convertNumber(7)
        Assertions.assertEquals("Lai", result);
    }

    @Test
    fun should_return_Gbsu_when_equal_9() {
        val result = gbsuFtbLaiService.convertNumber(9)
        Assertions.assertEquals("Gbsu", result);
    }

    @Test
    fun should_return_GbsuFtb_when_equal_51() {
        val result = gbsuFtbLaiService.convertNumber(51)
        Assertions.assertEquals("GbsuFtb", result);
    }

    @Test
    fun should_return_FtbGbsu_when_equal_53() {
        val result = gbsuFtbLaiService.convertNumber(53)
        Assertions.assertEquals("FtbGbsu", result);
    }

    @Test
    fun should_return_GbsuGbsuGbsu_when_equal_33() {
        val result = gbsuFtbLaiService.convertNumber(33)
        Assertions.assertEquals("GbsuGbsuGbsu", result);
    }

    @Test
    fun should_return_GbsuLai_when_equal_27() {
        val result = gbsuFtbLaiService.convertNumber(27)
        Assertions.assertEquals("GbsuLai", result);
    }

    @Test
    fun should_return_GbsuFtbFtb_when_equal_15() {
        val result = gbsuFtbLaiService.convertNumber(15)
        Assertions.assertEquals("GbsuFtbFtb", result);
    }

}
