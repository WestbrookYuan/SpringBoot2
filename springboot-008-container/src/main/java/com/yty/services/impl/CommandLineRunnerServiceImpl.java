package com.yty.services.impl;

import com.yty.services.CommandLineRunnerService;
import org.springframework.stereotype.Service;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Service("commandLineRunnerService")
public class CommandLineRunnerServiceImpl implements CommandLineRunnerService {

    @Override
    public void reportLogin(String name) {
        System.out.println(name + " logon");
    }
}
