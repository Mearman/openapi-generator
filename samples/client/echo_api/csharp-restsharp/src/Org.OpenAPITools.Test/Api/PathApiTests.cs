/*
 * Echo Server API
 *
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing PathApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class PathApiTests : IDisposable
    {
        private PathApi instance;

        public PathApiTests()
        {
            instance = new PathApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of PathApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' PathApi
            //Assert.IsType<PathApi>(instance);
        }

        /// <summary>
        /// Test TestsPathStringPathStringIntegerPathInteger
        /// </summary>
        [Fact]
        public void TestsPathStringPathStringIntegerPathIntegerTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string pathString = null;
            //int pathInteger = null;
            //var response = instance.TestsPathStringPathStringIntegerPathInteger(pathString, pathInteger);
            //Assert.IsType<string>(response);
        }
    }
}