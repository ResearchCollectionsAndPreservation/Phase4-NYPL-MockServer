package com.nypl.mockServer.service;

import com.nypl.mockServer.request.*;
import com.nypl.mockServer.response.*;
import org.springframework.stereotype.Service;

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
     CreateHoldResponse createHoldItem(CreateHoldRequest createHoldRequest);
}
