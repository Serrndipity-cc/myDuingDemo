package com.cc.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @authotr chencai
 * @createDate 2021/9/30
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest {
    private String name;

    private String role;
}
