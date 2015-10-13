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

import java.util.List;



/**
 *
 * Represents a Host on which all the admin tasks are performed.
 * Based on implementation, commands/tasks are run on the host.
 * 
 * @author SZ Quadri <szquadri@zaidsoft.com>
 */
public class Host implements System {
    
    
    
    public static final String PKG_MYSQL = "mysql";
    public static final String PKG_POSTGRESQL = "postgres";
    public static final String PKG_HTTD = "apache";
    public static final String PKG_NGINX = "nginx";
    public static final String PKG_BIND = "bind";
    public static final String PKG_POSTFIX = "postfix";

    public static Host byName(String dnsName) {
        return new Host(dnsName);
    }
    
    


    public Host() {
    
    }
    
    public Host(String hostname) { 
    
    }
    
    
    
    
    
    /**
     * Install a package on host using platform based package management.
     * @param packagename 
     */
    public void install(String packagename){
        
    }
    
    /**
     * UnInstall/erase a package from host using platform dependent package management.
     * @param packagename 
     */
    public void uninstall(String packagename){
        
    }
    
    
    /**
     * Add a new user to system 
     * @param username
     * @param id
     * @return 
     */
    public User useradd(String username, int id){
        return user(username);
    }
    
    /**
     * Return named user.
     * @param name
     * @return 
     */
    public User user(String name){
        return new User();
    }
    
    public Service service(String name){
        return null;
    }

    
    /**
     * Reboot the host by running shutdown -r now.
     */
    public void reboot(){
        
    }
    
    /**
     * Shutdown the host by calling shutdown -h now.
     */
    public void shutdown(){
        
    }
    
    
    public Disk disk(String name){
        return null;
    }
    
    public List<Disk> disks(){
        return null;
    }
    
    
    public List<VM> vmlist(){
        return null;
        
    }

    
    
    public Stats stats(){
        return new Stats();
    }
    
    
}
