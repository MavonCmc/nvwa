/*
 * Copyright 2015
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
package org.bigmouth.nvwa.authority.dao;

import java.util.List;

import org.bigmouth.nvwa.authority.entity.User;
import org.bigmouth.nvwa.authority.entity.UserSeletive;
import org.bigmouth.nvwa.mybatis.support.IMyBatisDao;


public interface UserDao extends IMyBatisDao<User, Long> {

    List<User> select(UserSeletive seletive);
}
