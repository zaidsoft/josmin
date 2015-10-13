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
 * Represents a Virtual Machine (guest) running on host.
 * Default implementation uses KVM Virtual Machines using libvirt java api.
 * It is assumed that libvirt is properly installed / running on the host.
 *
 * @author SZ Quadri <szquadri@zaidsoft.com>
 */
public class VM implements System {
    
    int ram; // MB
    
    int cpu; // count
    
    int ipaddress;
    
    List<Disk> disks;
    
    
    public void attach(Disk disk){
        
    }
        
    
    /**
     * Connect to the VM and provide host instance so we can work with it.
     * @return 
     */
    public Host connect(){
        return null;
    }
    
    
    
}
