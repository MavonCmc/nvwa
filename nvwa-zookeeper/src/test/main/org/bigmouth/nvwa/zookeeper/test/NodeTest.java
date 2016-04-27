/*
 * Copyright 2016 big-mouth.cn
 *
 * The Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.bigmouth.nvwa.zookeeper.test;

import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;
import org.bigmouth.nvwa.zookeeper.ZkClientHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * @author Allen Hu 
 * 2016-3-16
 */
public class NodeTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(NodeTest.class);
    static final ZkClientHolder client = new ZkClientHolder("http://172.16.20.43:8081/zkaddrs.html");
    
    public static void main(String[] args) throws Exception {
        client.init();
        CuratorFramework curator = client.get();
        
//        curator.create().creatingParentsIfNeeded().forPath("/nvwa/primary/second");
        
        for (;;) {
            String path = curator.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT_SEQUENTIAL).forPath("/nvwa/sequence/MPT");
            LOGGER.info(path);
            Thread.sleep(1000);
        }
    }
}
