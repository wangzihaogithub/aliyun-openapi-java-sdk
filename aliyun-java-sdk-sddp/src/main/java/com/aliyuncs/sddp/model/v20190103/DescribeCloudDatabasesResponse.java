/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeCloudDatabasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudDatabasesResponse extends AcsResponse {

	private String requestId;

	private List<CloudDatabase> cloudDatabaseList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CloudDatabase> getCloudDatabaseList() {
		return this.cloudDatabaseList;
	}

	public void setCloudDatabaseList(List<CloudDatabase> cloudDatabaseList) {
		this.cloudDatabaseList = cloudDatabaseList;
	}

	public static class CloudDatabase {

		private String engine;

		private String name;

		private String instanceId;

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public DescribeCloudDatabasesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudDatabasesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
