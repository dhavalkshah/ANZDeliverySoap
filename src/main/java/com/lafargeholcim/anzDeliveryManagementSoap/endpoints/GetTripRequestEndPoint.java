package com.lafargeholcim.anzDeliveryManagementSoap.endpoints;

import com.priceglider.signonglass.soap.GetTripRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GetTripRequestEndPoint {
    private static final String NAMESPACE_URI = "http://signonglass.priceglider.com/soap";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTripRequest")
    @ResponsePayload
    public void getStudent(@RequestPayload GetTripRequest tripRequest) {
        System.out.println("Inside getTripRequest");
    }
}
