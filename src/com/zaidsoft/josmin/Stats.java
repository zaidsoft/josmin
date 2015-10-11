/*
 * Copyright 2015 ZAIDSOFT. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.zaidsoft.josmin;

/**
 * System Info and Stats.
 *
 * @author SZ Quadri <szquadri@zaidsoft.com>
 */
public class Stats {
    
    
    public static final int TYPE_BARE_METAL = 10;
    public static final int TYPE_VIRT_MACHINE = 11;
    public static final int TYPE_CONTAINER = 20;    
    
    int cpu; //count of cpu/core
    
    float[] load; //1,5,15 min system load
    
    int uptime; //in seconds
    
    
    
    public int getType(){
        return 0;
    }
    
    
    public String getUname(){
        return "uname -a";
    }
    
    public String getOS(){
        return "/etc/issue";
    }
    
    
}
