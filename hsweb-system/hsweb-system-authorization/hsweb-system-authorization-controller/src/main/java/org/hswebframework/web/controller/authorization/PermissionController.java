/*
 *  Copyright 2016 http://www.hswebframework.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package org.hswebframework.web.controller.authorization;

import io.swagger.annotations.Api;
import org.hswebframework.web.authorization.annotation.Authorize;
import org.hswebframework.web.logging.AccessLogger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhao
 */
@RestController
@RequestMapping("${hsweb.web.mappings.permission:permission}")
@AccessLogger("{permission_manager}")
@Authorize(permission = "permission")
@Api(tags = "permission-manager", description = "权限管理")
public class PermissionController {

}