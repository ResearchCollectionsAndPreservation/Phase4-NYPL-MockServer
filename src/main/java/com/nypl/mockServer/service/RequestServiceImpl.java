package com.nypl.mockServer.service;

import com.nypl.mockServer.*;
import com.nypl.mockServer.dao.*;
import com.nypl.mockServer.model.CheckoutData;
import com.nypl.mockServer.JobData;
import com.nypl.mockServer.Notice;
import com.nypl.mockServer.model.HoldData;
import com.nypl.mockServer.request.*;
import com.nypl.mockServer.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by giris on 10/3/20.
 */
@Service
@Transactional
public class RequestServiceImpl implements RequestService {

    @Autowired
    PatronRepository patronRepository;
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    CheckoutDataRepository checkoutDataRepository;
    @Autowired
    JobRepository jobRepository;
    @Autowired
    HoldDataRepository holdDataRepository;

    @Override
    public CheckoutResponse checkoutItem(CheckoutRequest checkoutRequest) {
        CheckoutResponse checkoutResponse = new CheckoutResponse();
        CheckoutData checkoutData = new CheckoutData();
        checkoutData.setJobId("13");
        try{
            if(patronRepository.findByPatronIdentifier(checkoutRequest.getPatronBarcode())!= null) {
                if(itemRepository.findByItemIdentifier(checkoutRequest.getItemBarcode())!= null) {
                    checkoutData.setCreatedDate(DateFormat());
                    checkoutData.setItemBarcode(checkoutRequest.getItemBarcode());
                    checkoutData.setPatronBarcode(checkoutRequest.getPatronBarcode());
                    checkoutData.setDesiredDateDue(checkoutRequest.getDesiredDateDue());
                    checkoutData.setProcessed(true);
                    checkoutData.setJobId("1");
                    checkoutDataRepository.save(checkoutData);
                    checkoutData.setSuccess(true);
                }else{
                    checkoutData.setJobId("6");
                }
            }
        }catch (Exception e){
            checkoutData.setJobId("2");
        }
        checkoutResponse.setData(checkoutData);
        return checkoutResponse;
    }

    @Override
    public CheckinResponse checkinItem(CheckinRequest checkinRequest) {
        CheckinResponse checkinResponse = new CheckinResponse();
        CheckinData checkinData = new CheckinData();
        checkinData.setJobId("6");
        try {
            if(itemRepository.findByItemIdentifier(checkinRequest.getItemBarcode())!= null) {

                if (checkoutDataRepository.deleteByItemBarcode(checkinRequest.getItemBarcode())!=0) {
                    checkinData.setCreatedDate(DateFormat());
                    checkinData.setItemBarcode(checkinRequest.getItemBarcode());
                    checkinData.setProcessed(true);
                    checkinData.setSuccess(true);
                    checkinData.setJobId("3");
                }
            }
        }catch (Exception e){
            //e.printStackTrace();
            checkinData.setJobId("4");
        }
        checkinResponse.setData(checkinData);
        return checkinResponse;
    }

    @Override
    public JobResponse getJobs(String jobId) {
        JobResponse jobResponse = new JobResponse();
        JobData jobData = new JobData();
        if(jobId!=null) {
            List<Notice> noticeList = new ArrayList<>();
            Notice notice = new Notice();
            notice.setText(getScreenMessage(jobId));
            noticeList.add(notice);
            jobData.setJobId(jobId);
            jobData.setSuccess(true);
            jobData.setFinished(true);
            jobData.setStarted(true);
            jobData.setNotices(noticeList);
            jobResponse.setData(jobData);
        }
        return jobResponse;
    }

    private String getScreenMessage(String jobId){
        try {
            return jobRepository.findByJobId(jobId).getMessage();
        }catch (Exception e){
            return "";
        }
    }

    @Override
    public ItemHoldResponse holdItem(ItemRequestInformation itemRequestInformation) {
        ItemHoldResponse itemHoldResponse = new ItemHoldResponse();

        itemHoldResponse.setAvailable(true);
        itemHoldResponse.setSuccess(true);
        itemHoldResponse.setCreatedDate(DateFormat());
        itemHoldResponse.setScreenMessage("Request Placed");
        itemHoldResponse.setBibId(itemRequestInformation.getBibId());
        itemHoldResponse.setTrackingId(itemRequestInformation.getTrackingId());
        itemHoldResponse.setTitleIdentifier(itemRequestInformation.getTitleIdentifier());
        itemHoldResponse.setPatronIdentifier(itemRequestInformation.getPatronBarcode());
        itemHoldResponse.setItemOwningInstitution(itemRequestInformation.getItemOwningInstitution());
        itemHoldResponse.setItemBarcode(itemRequestInformation.getItemBarcodes().get(0));
        itemHoldResponse.setPickupLocation(itemRequestInformation.getPickupLocation());
        itemHoldResponse.setExpirationDate(itemRequestInformation.getExpirationDate());
        itemHoldResponse.setJobId("14");
        return itemHoldResponse;
    }

    @Override
    public RecallResponse recallItem(RecallRequest recallRequest) {
        RecallResponse recallResponse = new RecallResponse();
        RecallData recallData = new RecallData();
        recallData.setJobId("6");
        try {
            if (itemRepository.findByItemIdentifier(recallRequest.getItemBarcode()) != null) {
                recallData.setCreatedDate(DateFormat());
                recallData.setItemBarcode(recallRequest.getItemBarcode());
                recallData.setOwningInstitutionId(recallRequest.getOwningInstitutionId());
                recallData.setJobId("7");
            }
        }catch (Exception e){
            recallData.setJobId("8");
        }

        recallResponse.setData(recallData);
        return recallResponse;
    }

    @Override
    public RefileResponse refileItem(RefileRequest refileRequest) {

        RefileResponse refileResponse = new RefileResponse();
        RefileData refileData = new RefileData();
        refileData.setJobId("6");
        try {
            if (itemRepository.findByItemIdentifier(refileRequest.getItemBarcode()) != null) {
                refileData.setCreatedDate(DateFormat());
                refileData.setItemBarcode(refileRequest.getItemBarcode());
                refileData.setJobId("9");
            }
        }catch (Exception e){
            refileData.setJobId("10");
        }
        refileResponse.setData(refileData);
        return refileResponse;
    }

    @Override
    public NYPLHoldResponse nyplHoldItem(String trackingId) {
        NYPLHoldResponse nyplHoldResponse = new NYPLHoldResponse();
        NYPLHoldData nyplHoldData = new NYPLHoldData();
        try{
            if(holdDataRepository.findByTrackingId(trackingId)!=null) {
                nyplHoldData.setCreatedDate(DateFormat());
                nyplHoldData.setJobId("14");
            }

        }catch (Exception e){
            nyplHoldData.setJobId("15");
        }
        nyplHoldResponse.setData(nyplHoldData);
        return nyplHoldResponse;
    }

    @Override
    public CreateHoldResponse createHoldItem(CreateHoldRequest createHoldRequest) {
        CreateHoldResponse createHoldResponse = new CreateHoldResponse();
        HoldData holdData = new HoldData();
        try {
            holdData.setCreatedDate(DateFormat());
            holdData.setDescription(createHoldRequest.getDescription());
            holdData.setItemBarcode(createHoldRequest.getItemBarcode());
            holdData.setOwningInstitutionId(createHoldRequest.getOwningInstitutionId());
            holdData.setPatronBarcode(createHoldRequest.getPatronBarcode());
            holdData.setTrackingId(createHoldRequest.getTrackingId());
            holdDataRepository.save(holdData);
        }catch(Exception e){
            e.printStackTrace();
        }
        createHoldResponse.setData(holdData);
        return createHoldResponse;
    }

    @Override
    public CancelHoldResponse cancelHold(CancelHoldRequest cancelHoldRequest) {
        CancelHoldResponse cancelHoldResponse = new CancelHoldResponse();
        CancelHoldData cancelHoldData = new CancelHoldData();
        cancelHoldData.setJobId("13");
        try {
            if (patronRepository.findByPatronIdentifier(cancelHoldRequest.getPatronBarcode()) != null) {
                if (itemRepository.findByItemIdentifier(cancelHoldRequest.getItemBarcode()) != null) {
                    if (holdDataRepository.deleteByItemBarcode(cancelHoldRequest.getItemBarcode()) != 0) {
                        cancelHoldData.setItemBarcode(cancelHoldRequest.getItemBarcode());
                        cancelHoldData.setPatronBarcode(cancelHoldRequest.getPatronBarcode());
                        cancelHoldData.setOwningInstitutionId(cancelHoldRequest.getOwningInstitutionId());
                        cancelHoldData.setTrackingId(cancelHoldRequest.getTrackingId());
                        cancelHoldData.setJobId("11");
                    }
                } else {
                    cancelHoldData.setJobId("6");
                }
            }
        }catch (Exception e){
            cancelHoldData.setJobId("12");

        }
        cancelHoldResponse.setData(cancelHoldData);
        return cancelHoldResponse;
    }



    private String DateFormat(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String strDate= formatter.format(date);
        return strDate;
    }


}
