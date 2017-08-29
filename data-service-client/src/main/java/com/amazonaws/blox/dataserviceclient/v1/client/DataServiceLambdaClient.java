/*
 * Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may
 * not use this file except in compliance with the License. A copy of the
 * License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "LICENSE" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.blox.dataserviceclient.v1.client;

import com.amazonaws.blox.dataservicemodel.v1.client.DataService;
import com.amazonaws.blox.dataservicemodel.v1.exception.EnvironmentNotFoundException;
import com.amazonaws.blox.dataservicemodel.v1.exception.InvalidParameterException;
import com.amazonaws.blox.dataservicemodel.v1.exception.ServiceException;
import com.amazonaws.blox.dataservicemodel.v1.model.CreateEnvironmentRequest;
import com.amazonaws.blox.dataservicemodel.v1.model.CreateEnvironmentResponse;
import com.amazonaws.blox.dataservicemodel.v1.model.GetEnvironmentRequest;
import com.amazonaws.blox.dataservicemodel.v1.model.GetEnvironmentResponse;
import com.amazonaws.blox.dataservicemodel.v1.model.StartDeploymentRequest;
import com.amazonaws.blox.dataservicemodel.v1.model.StartDeploymentResponse;
import lombok.AllArgsConstructor;

/**
 * AWS Lambda client for the DataService. The DataService requests are implemented by invoking a
 * Lambda function.
 */
@AllArgsConstructor
public class DataServiceLambdaClient implements DataService {

  @Override
  public CreateEnvironmentResponse createEnvironment(final CreateEnvironmentRequest request) {
    throw new UnsupportedOperationException();
  }

  @Override
  public GetEnvironmentResponse getEnvironment(GetEnvironmentRequest request)
      throws EnvironmentNotFoundException, InvalidParameterException, ServiceException {
    return null;
  }

  @Override
  public StartDeploymentResponse startDeployment(final StartDeploymentRequest request) {
    throw new UnsupportedOperationException();
  }
}
