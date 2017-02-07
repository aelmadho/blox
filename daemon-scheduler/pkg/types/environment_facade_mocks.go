// Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License"). You may
// not use this file except in compliance with the License. A copy of the
// License is located at
//
//     http://aws.amazon.com/apache2.0/
//
// or in the "license" file accompanying this file. This file is distributed
// on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
// express or implied. See the License for the specific language governing
// permissions and limitations under the License.

// Automatically generated by MockGen. DO NOT EDIT!
// Source: pkg/types/environment_facade.go

package types

import (
	gomock "github.com/golang/mock/gomock"
)

// Mock of EnvironmentFacade interface
type MockEnvironmentFacade struct {
	ctrl     *gomock.Controller
	recorder *_MockEnvironmentFacadeRecorder
}

// Recorder for MockEnvironmentFacade (not exported)
type _MockEnvironmentFacadeRecorder struct {
	mock *MockEnvironmentFacade
}

func NewMockEnvironmentFacade(ctrl *gomock.Controller) *MockEnvironmentFacade {
	mock := &MockEnvironmentFacade{ctrl: ctrl}
	mock.recorder = &_MockEnvironmentFacadeRecorder{mock}
	return mock
}

func (_m *MockEnvironmentFacade) EXPECT() *_MockEnvironmentFacadeRecorder {
	return _m.recorder
}

func (_m *MockEnvironmentFacade) InstanceARNs(environment *Environment) ([]*string, error) {
	ret := _m.ctrl.Call(_m, "InstanceARNs", environment)
	ret0, _ := ret[0].([]*string)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

func (_mr *_MockEnvironmentFacadeRecorder) InstanceARNs(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "InstanceARNs", arg0)
}
