package com.nypl.mockServer.service;

import com.nypl.mockServer.request.*;
import com.nypl.mockServer.response.*;


/**
 * Created by giris on 10/3/20.
 */

public interface RequestService {
     CheckoutResponse checkoutItem(CheckoutRequest checkoutRequest);
     CheckinResponse checkinItem(CheckinRequest checkinRequest);
     JobResponse getJobs(String jobId);
     ItemHoldResponse holdItem(ItemRequestInformation itemRequestInformation);
     CancelHoldResponse cancelHold(CancelHoldRequest cancelHoldRequest);
     RecallResponse recallItem(RecallRequest recallRequest);
     RefileResponse refileItem(RefileRequest refileRequest);
     NYPLHoldResponse nyplHoldItem(String trackingId);
     NYPLHoldResponse nyplHoldRequest(NYPLHoldRequest nyplHoldRequest);
     CreateHoldResponse createHoldItem(CreateHoldRequest createHoldRequest);
     ItemInformationResponse findItemByItemId(String itemIdentifier);
     PatronInformationResponse findPatronByPatronId(String patronIdentifier);
}
