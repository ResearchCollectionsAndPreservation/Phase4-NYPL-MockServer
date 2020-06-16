package com.nypl.mockServer.controller;

import com.nypl.mockServer.request.*;
import com.nypl.mockServer.response.*;
import com.nypl.mockServer.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




/**
 * Created by giris on 10/3/20.
 */

@RestController
@RequestMapping("/rest")
public class RequestController {

    @Autowired
    RequestService requestService;

    @PostMapping("/checkout-requests")
    public ResponseEntity<CheckoutResponse> checkoutItem(@RequestBody CheckoutRequest checkoutRequest){
        CheckoutResponse checkoutResponse = requestService.checkoutItem(checkoutRequest);
        return  new ResponseEntity<CheckoutResponse>(checkoutResponse, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/checkin-requests")
    public ResponseEntity<CheckinResponse> checkinItem(@RequestBody CheckinRequest checkinRequest){
        CheckinResponse checkinResponse = requestService.checkinItem(checkinRequest);
        return  new ResponseEntity<CheckinResponse>(checkinResponse, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/jobs/{jobId}")
    public ResponseEntity<JobResponse> getJobs(@PathVariable("jobId") String jobId){
        JobResponse jobResponse = requestService.getJobs(jobId);
        return  new ResponseEntity<JobResponse>(jobResponse, new HttpHeaders(), HttpStatus.OK);
    }
    @PostMapping("/hold-requests")
    public ResponseEntity<NYPLHoldResponse> nyplHoldRequestItem(@RequestBody NYPLHoldRequest nyplHoldRequest){
        NYPLHoldResponse nyplHoldResponse = requestService.nyplHoldRequest(nyplHoldRequest);
        return  new ResponseEntity<NYPLHoldResponse>(nyplHoldResponse, new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping("/hold-requests/{trackingId}")
    public ResponseEntity<NYPLHoldResponse> nyplHoldItem(@PathVariable("trackingId") String trackingId){
        NYPLHoldResponse nyplHoldResponse = requestService.nyplHoldItem(trackingId);
        return  new ResponseEntity<NYPLHoldResponse>(nyplHoldResponse, new HttpHeaders(), HttpStatus.OK);
    }
    @PostMapping("/hold-item-requests")
    public ResponseEntity<ItemHoldResponse> holdItem(@RequestBody ItemRequestInformation itemRequestInformation){
        ItemHoldResponse itemHoldResponse = requestService.holdItem(itemRequestInformation);
        return  new ResponseEntity<ItemHoldResponse>(itemHoldResponse, new HttpHeaders(), HttpStatus.OK);
    }
    @PostMapping("/recap/cancel-hold-requests")
    public ResponseEntity<CancelHoldResponse> cancelHold(@RequestBody CancelHoldRequest cancelHoldRequest){
       CancelHoldResponse cancelHoldResponse = requestService.cancelHold(cancelHoldRequest);
        return  new ResponseEntity<CancelHoldResponse>(cancelHoldResponse, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/recap/refile-requests")
    public ResponseEntity<RefileResponse> refileItem(@RequestBody RefileRequest refileRequest){
        RefileResponse refileResponse = requestService.refileItem(refileRequest);
        return  new ResponseEntity<RefileResponse>(refileResponse, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/recap/recall-requests")
    public ResponseEntity<RecallResponse> recallItem(@RequestBody RecallRequest recallRequest){
        RecallResponse recallResponse = requestService.recallItem(recallRequest);
        return  new ResponseEntity<RecallResponse>(recallResponse, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/recap/hold-requests")
    public ResponseEntity<CreateHoldResponse> createHoldItem(@RequestBody CreateHoldRequest createHoldRequest){
        CreateHoldResponse createHoldResponse = requestService.createHoldItem(createHoldRequest);
        return  new ResponseEntity<CreateHoldResponse>(createHoldResponse, new HttpHeaders(), HttpStatus.OK);
    }

  @PostMapping("/items/test/{itemIdentifier}")
    public ResponseEntity<ItemInformationResponse> lookupItem(@RequestParam String itemIdentifier){
        ItemInformationResponse itemInformationResponse = requestService.findItemByItemId(itemIdentifier);
        return new ResponseEntity<ItemInformationResponse>(itemInformationResponse,new HttpHeaders(),HttpStatus.OK);
  }
  @GetMapping("/patrons")
    public  ResponseEntity<PatronInformationResponse> lookupPatron(@RequestParam("barcode") String patronIdentifier){
        PatronInformationResponse patronInformationResponse=requestService.findPatronByPatronId(patronIdentifier);
        return new ResponseEntity<PatronInformationResponse>(patronInformationResponse,new HttpHeaders(),HttpStatus.OK);
  }
  /*  @PostMapping("/recap/cancel-hold-requests")
    public ResponseEntity<CancelHoldResponse> cancelHoldItem(@RequestBody CancelHoldRequest cancelHoldRequest){
        CancelHoldResponse cancelHoldResponse = requestService.cancelHold(cancelHoldRequest);
        return  new ResponseEntity<CancelHoldResponse>(cancelHoldResponse, new HttpHeaders(), HttpStatus.OK);
    }
*/

}
