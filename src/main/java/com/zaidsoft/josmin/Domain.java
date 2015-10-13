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
 * Hosted Domain (Virtual Server) as defined in linked Shared/Web Hosting
 * Manager (e.g. Virtualmin). This class does not represents Internet Domain
 * Name in general way; only virtual hosting view of it as hosted on the host
 * and managed by some web hosting manager.
 *
 * @author SZ Quadri <szquadri@zaidsoft.com>
 */
public class Domain {

    public static final String APP_WORDPRESS = "wp";
    public static final String APP_JOOMLA = "joomla";
    public static final String APP_OPENCART = "opencart";
    public static final String APP_MAGENTO = "magento";

    public void installApp(String app, String path) {

    }

    /**
     * Disk space usage in MB
     *
     * @return
     */
    public int diskUsage() {
        return 0;
    }

    public void app(String app, String path) {

    }

    public List<WebApp> apps() {
        return null;
    }

    public List<MailAc> mailAccounts() {
        return null;
    }

    /**
     * Return User if the MaiAc represents a system user, null otherwise.
     *
     * @return
     */
    public User getUser() {
        return null;
    }

    public class WebApp {

        String path; //e.g.; "/blog"
        String appid;//app unique name
        String version;//app version

        public void delete(boolean allDataAlso) {
            //delete the app with data (if asked)
        }

        /**
         * Enable/Disable app.
         */
        public void toggle() {

        }

        public boolean isEnabled() {
            return false;
        }

    }

    /**
     * IMAP Mail A/c
     */
    public class MailAc {

        String name;
        String email;
        String username; //null: same as email
        String password; //initial
        int quota; //MB
        String bcc; //bcc all received mail
        String forward; //forward all mail to

        String altmail; //alternate mail id of user

        /**
         * If the a/c is new it is created on server; otherwise updated.
         */
        public void save() {

        }

        /**
         * Delete this mail a/c
         */
        public void delete(boolean delAllData) {

        }

        /**
         * Return User if the MaiAc represents a system user, null otherwise.
         *
         * @return
         */
        public User getUser() {
            return null;
        }

    }

}
