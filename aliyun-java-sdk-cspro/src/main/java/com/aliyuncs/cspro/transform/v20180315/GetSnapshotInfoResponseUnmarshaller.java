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

package com.aliyuncs.cspro.transform.v20180315;

import com.aliyuncs.cspro.model.v20180315.GetSnapshotInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSnapshotInfoResponseUnmarshaller {

	public static GetSnapshotInfoResponse unmarshall(GetSnapshotInfoResponse getSnapshotInfoResponse, UnmarshallerContext _ctx) {
		
		getSnapshotInfoResponse.setRequestId(_ctx.stringValue("GetSnapshotInfoResponse.RequestId"));
		getSnapshotInfoResponse.setSuccess(_ctx.booleanValue("GetSnapshotInfoResponse.Success"));
		getSnapshotInfoResponse.setCode(_ctx.stringValue("GetSnapshotInfoResponse.Code"));
		getSnapshotInfoResponse.setMessage(_ctx.stringValue("GetSnapshotInfoResponse.Message"));
		getSnapshotInfoResponse.setData(_ctx.stringValue("GetSnapshotInfoResponse.Data"));
	 
	 	return getSnapshotInfoResponse;
	}
}