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
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing BodyApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class BodyApiTests : IDisposable
    {
        private BodyApi instance;

        public BodyApiTests()
        {
            instance = new BodyApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of BodyApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' BodyApi
            //Assert.IsType<BodyApi>(instance);
        }

        /// <summary>
        /// Test TestBinaryGif
        /// </summary>
        [Fact]
        public void TestBinaryGifTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.TestBinaryGif();
            //Assert.IsType<System.IO.Stream>(response);
        }

        /// <summary>
        /// Test TestBodyApplicationOctetstreamBinary
        /// </summary>
        [Fact]
        public void TestBodyApplicationOctetstreamBinaryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //System.IO.Stream? body = null;
            //var response = instance.TestBodyApplicationOctetstreamBinary(body);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test TestEchoBodyFreeFormObjectResponseString
        /// </summary>
        [Fact]
        public void TestEchoBodyFreeFormObjectResponseStringTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object? body = null;
            //var response = instance.TestEchoBodyFreeFormObjectResponseString(body);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test TestEchoBodyPet
        /// </summary>
        [Fact]
        public void TestEchoBodyPetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Pet? pet = null;
            //var response = instance.TestEchoBodyPet(pet);
            //Assert.IsType<Pet>(response);
        }

        /// <summary>
        /// Test TestEchoBodyPetResponseString
        /// </summary>
        [Fact]
        public void TestEchoBodyPetResponseStringTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Pet? pet = null;
            //var response = instance.TestEchoBodyPetResponseString(pet);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test TestEchoBodyTagResponseString
        /// </summary>
        [Fact]
        public void TestEchoBodyTagResponseStringTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Tag? tag = null;
            //var response = instance.TestEchoBodyTagResponseString(tag);
            //Assert.IsType<string>(response);
        }
    }
}