package com.example.transmission.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "complaints")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complaint_id")
    private Long complaintId;

    @Column(name = "subscriber_number", length = 50)
    private String subscriberNumber;

    @Column(name = "complainant_name", columnDefinition = "TEXT")
    private String complainantName;

    @Column(name = "complainant_address", columnDefinition = "TEXT")
    private String complainantAddress;

    @Column(name = "contact_count")
    private Integer contactCount;

    @Column(name = "receiver_name", columnDefinition = "TEXT")
    private String receiverName;

    @Column(name = "received_date")
    private LocalDate receivedDate;

    @Column(name = "received_time")
    private LocalTime receivedTime;

    @Column(name = "complaint_group", columnDefinition = "TEXT")
    private String complaintGroup;

    @Column(name = "category", columnDefinition = "TEXT")
    private String category;

    @Column(name = "complaint_type", columnDefinition = "TEXT")
    private String complaintType;

    @Column(name = "reception_method", columnDefinition = "TEXT")
    private String receptionMethod;

    @Column(name = "priority_level", length = 50)
    private String priorityLevel;

    @Column(name = "complaint_content", columnDefinition = "TEXT")
    private String complaintContent;

    @Column(name = "latest_customer_appointment")
    private LocalDate latestCustomerAppointment;

    @Column(name = "deadline_date")
    private LocalDate deadlineDate;

    @Column(name = "handling_content", columnDefinition = "TEXT")
    private String handlingContent;

    @Column(name = "handling_unit", columnDefinition = "TEXT")
    private String handlingUnit;

    @Column(name = "appointment_date")
    private LocalDate appointmentDate;

    @Column(name = "complaint_status", length = 100)
    private String complaintStatus;

    @Column(name = "handling_result", columnDefinition = "TEXT")
    private String handlingResult;

    @Column(name = "last_handler", columnDefinition = "TEXT")
    private String lastHandler;

    @Column(name = "closed_date")
    private LocalDate closedDate;

    @Column(name = "closed_time")
    private LocalTime closedTime;

    @Column(name = "complaint_level", length = 100)
    private String complaintLevel;

    @Column(name = "arising_error", columnDefinition = "TEXT")
    private String arisingError;

    @Column(name = "customer_feedback_date")
    private LocalDate customerFeedbackDate;

    @Column(name = "feedback_appointment_date")
    private LocalDate feedbackAppointmentDate;

    @Column(name = "satisfaction_level", length = 100)
    private String satisfactionLevel;

    @Column(name = "return_result", columnDefinition = "TEXT")
    private String returnResult;

    @Column(name = "return_reason", columnDefinition = "TEXT")
    private String returnReason;

    @Column(name = "duplicate_id", length = 100)
    private String duplicateId;

    @Column(name = "reception_source", columnDefinition = "TEXT")
    private String receptionSource;

    @Column(name = "district", columnDefinition = "TEXT")
    private String district;

    @Column(name = "ward", columnDefinition = "TEXT")
    private String ward;

    @Column(name = "reception_channel", columnDefinition = "TEXT")
    private String receptionChannel;

    @Column(name = "package", columnDefinition = "TEXT")
    private String packageInfo;

    @Column(name = "total_processing_hours")
    private Integer totalProcessingHours;

    @Column(name = "dslam_dlu", columnDefinition = "TEXT")
    private String dslamDlu;

    @Column(name = "root_cause_lvl1", columnDefinition = "TEXT")
    private String rootCauseLvl1;

    @Column(name = "root_cause_lvl2", columnDefinition = "TEXT")
    private String rootCauseLvl2;

    @Column(name = "root_cause_lvl3", columnDefinition = "TEXT")
    private String rootCauseLvl3;

    @Column(name = "root_cause_lvl4", columnDefinition = "TEXT")
    private String rootCauseLvl4;

    @Column(name = "contract_number", length = 100)
    private String contractNumber;

    @Column(name = "note", columnDefinition = "TEXT")
    private String note;

    @Column(name = "assigner", columnDefinition = "TEXT")
    private String assigner;

    @Column(name = "assignee", columnDefinition = "TEXT")
    private String assignee;

    @Column(name = "progress", length = 100)
    private String progress;

    @Column(name = "overdue_hours")
    private Integer overdueHours;

    @Column(name = "preliminary_handling", columnDefinition = "TEXT")
    private String preliminaryHandling;

    @Column(name = "contact_number", length = 50)
    private String contactNumber;

    @Column(name = "additional_info", columnDefinition = "TEXT")
    private String additionalInfo;

    @Column(name = "sms_1715", length = 50)
    private String sms1715;

    @Column(name = "weak_point_code", length = 100)
    private String weakPointCode;

    @Column(name = "responsible_unit", columnDefinition = "TEXT")
    private String responsibleUnit;

    @Column(name = "local_staff_id", length = 100)
    private String localStaffId;

    @Column(name = "service_type", length = 100)
    private String serviceType;

    @Column(name = "customer_type", length = 100)
    private String customerType;

    @Column(name = "customer_detail", columnDefinition = "TEXT")
    private String customerDetail;

    @Column(name = "subscriber_status", length = 100)
    private String subscriberStatus;

    @Column(name = "subscription_status", length = 100)
    private String subscriptionStatus;

    @Column(name = "overdue_cause_lvl1", columnDefinition = "TEXT")
    private String overdueCauseLvl1;

    @Column(name = "overdue_cause_lvl2", columnDefinition = "TEXT")
    private String overdueCauseLvl2;

    @Column(name = "overdue_department", columnDefinition = "TEXT")
    private String overdueDepartment;

    @Column(name = "ntms_unit", columnDefinition = "TEXT")
    private String ntmsUnit;

    @Column(name = "ntms_staff", columnDefinition = "TEXT")
    private String ntmsStaff;

    @Column(name = "appointment_count")
    private Integer appointmentCount;

    @Column(name = "successful_appointments")
    private Integer successfulAppointments;

    @Column(name = "failed_appointments")
    private Integer failedAppointments;

    @Column(name = "pending_appointments")
    private Integer pendingAppointments;

    @Column(name = "appointment_user", columnDefinition = "TEXT")
    private String appointmentUser;

    @Column(name = "appointment_evaluation", columnDefinition = "TEXT")
    private String appointmentEvaluation;

    @Column(name = "aon_gpon", length = 50)
    private String aonGpon;

    @Column(name = "coordination_unit_type", columnDefinition = "TEXT")
    private String coordinationUnitType;

    @Column(name = "note_content", columnDefinition = "TEXT")
    private String noteContent;

    @Column(name = "subscriber_code", length = 100)
    private String subscriberCode;

    @Column(name = "gnoc_processing_hours")
    private Integer gnocProcessingHours;

    @Column(name = "satisfaction_lvl2", length = 100)
    private String satisfactionLvl2;

    @Column(name = "complaint_eval", columnDefinition = "TEXT")
    private String complaintEval;

    @Column(name = "ntms_expected_completion")
    private LocalDateTime ntmsExpectedCompletion;

    @Column(name = "sms_1715_content", columnDefinition = "TEXT")
    private String sms1715Content;

    @Column(name = "coordination_status", length = 100)
    private String coordinationStatus;

    @Column(name = "receiving_department", columnDefinition = "TEXT")
    private String receivingDepartment;

    @Column(name = "coordination_unit", columnDefinition = "TEXT")
    private String coordinationUnit;

    @Column(name = "tech_appointment_time")
    private LocalDateTime techAppointmentTime;

    @Column(name = "coordination_result", columnDefinition = "TEXT")
    private String coordinationResult;

    @Column(name = "coordination_failure_cause", columnDefinition = "TEXT")
    private String coordinationFailureCause;

    @Column(name = "spm_processing_hours")
    private Integer spmProcessingHours;

    @Column(name = "gnoc_progress", length = 100)
    private String gnocProgress;

    @Column(name = "gnoc_appointment_hours")
    private Integer gnocAppointmentHours;

    @Column(name = "incident_completed_date")
    private LocalDate incidentCompletedDate;

    @Column(name = "incident_completed_time")
    private LocalTime incidentCompletedTime;

    @Column(name = "error_code", length = 100)
    private String errorCode;

    @Column(name = "ft_cd_reject", length = 50)
    private String ftCdReject;

    @Column(name = "vip_customer")
    private Boolean vipCustomer;

    @Column(name = "critical_point", length = 100)
    private String criticalPoint;

    @Column(name = "customer_classification", length = 100)
    private String customerClassification;

    @Column(name = "subscriber", length = 100)
    private String subscriber;

    @Column(name = "segment", length = 100)
    private String segment;

    @Column(name = "payment_method", length = 100)
    private String paymentMethod;

    @Column(name = "arpu_info", columnDefinition = "TEXT")
    private String arpuInfo;

    @Column(name = "hot_tracking_time")
    private LocalDateTime hotTrackingTime;

    @Column(name = "job_status", length = 100)
    private String jobStatus;

    @Column(name = "error_description", columnDefinition = "TEXT")
    private String errorDescription;

    @Column(name = "cause", columnDefinition = "TEXT")
    private String cause;

    @Column(name = "solution", columnDefinition = "TEXT")
    private String solution;

    @Column(name = "detailed_result", columnDefinition = "TEXT")
    private String detailedResult;

    @Column(name = "response_time")
    private LocalDateTime responseTime;

    @Column(name = "ticket_code", length = 255)
    private String ticketCode;

    @Column(name = "workorder_code", length = 100)
    private String workorderCode;

    @Column(name = "gnoc_cell_id", length = 100)
    private String gnocCellId;

    @Column(name = "critical_channel", length = 100)
    private String criticalChannel;

    @Column(name = "handling_priority", length = 50)
    private String handlingPriority;

    @Column(name = "handling_method", length = 100)
    private String handlingMethod;

    @Column(name = "g_line", length = 100)
    private String gLine;

    @Column(name = "subscriber_cable_length", length = 100)
    private String subscriberCableLength;

    @Column(name = "project_code", length = 100)
    private String projectCode;

    @Column(name = "project_name", columnDefinition = "TEXT")
    private String projectName;

    @Column(name = "project_address", columnDefinition = "TEXT")
    private String projectAddress;

    @Column(name = "ticket_closure_source", columnDefinition = "TEXT")
    private String ticketClosureSource;

    @Column(name = "cancel_reason", columnDefinition = "TEXT")
    private String cancelReason;

    @Column(name = "cancel_request_subscriber", length = 100)
    private String cancelRequestSubscriber;

    @Column(name = "actual_processing_hours")
    private Integer actualProcessingHours;

    @Column(name = "region_type", length = 100)
    private String regionType;

    @Column(name = "explanation_branch", columnDefinition = "TEXT")
    private String explanationBranch;

    @Column(name = "transaction_store", columnDefinition = "TEXT")
    private String transactionStore;

    @Column(name = "hamlet", columnDefinition = "TEXT")
    private String hamlet;

    @Column(name = "gnoc_completion_time1")
    private LocalDateTime gnocCompletionTime1;

    @Column(name = "feedback_deadline")
    private LocalDate feedbackDeadline;

    @Column(name = "error_transfer_date")
    private LocalDate errorTransferDate;

    @Column(name = "tech_feedback_content", columnDefinition = "TEXT")
    private String techFeedbackContent;

    @Column(name = "cskh_feedback_status", columnDefinition = "TEXT")
    private String cskhFeedbackStatus;

    @Column(name = "penalty", length = 100)
    private String penalty;

    @Column(name = "violator_name", columnDefinition = "TEXT")
    private String violatorName;

    @Column(name = "violator_card_id", length = 100)
    private String violatorCardId;

    @Column(name = "email", columnDefinition = "TEXT")
    private String email;

    @Column(name = "phone_number", length = 50)
    private String phoneNumber;

    @Column(name = "technical_contact_point", columnDefinition = "TEXT")
    private String technicalContactPoint;

    @Column(name = "kv_region", columnDefinition = "TEXT")
    private String kvRegion;

    @Column(name = "happy_call_staff", columnDefinition = "TEXT")
    private String happyCallStaff;

    @Column(name = "hpc_result", columnDefinition = "TEXT")
    private String hpcResult;

    @Column(name = "hpc_result_detail", columnDefinition = "TEXT")
    private String hpcResultDetail;

    @Column(name = "contact_phone", length = 50)
    private String contactPhone;

    @Column(name = "processing_object", columnDefinition = "TEXT")
    private String processingObject;

    @Column(name = "new_province", columnDefinition = "TEXT")
    private String newProvince;

    @Column(name = "new_ward", columnDefinition = "TEXT")
    private String newWard;

    public Long getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Long complaintId) {
        this.complaintId = complaintId;
    }

    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }

    public String getComplainantName() {
        return complainantName;
    }

    public void setComplainantName(String complainantName) {
        this.complainantName = complainantName;
    }

    public String getComplainantAddress() {
        return complainantAddress;
    }

    public void setComplainantAddress(String complainantAddress) {
        this.complainantAddress = complainantAddress;
    }

    public Integer getContactCount() {
        return contactCount;
    }

    public void setContactCount(Integer contactCount) {
        this.contactCount = contactCount;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public LocalTime getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(LocalTime receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getComplaintGroup() {
        return complaintGroup;
    }

    public void setComplaintGroup(String complaintGroup) {
        this.complaintGroup = complaintGroup;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getReceptionMethod() {
        return receptionMethod;
    }

    public void setReceptionMethod(String receptionMethod) {
        this.receptionMethod = receptionMethod;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
    }

    public LocalDate getLatestCustomerAppointment() {
        return latestCustomerAppointment;
    }

    public void setLatestCustomerAppointment(LocalDate latestCustomerAppointment) {
        this.latestCustomerAppointment = latestCustomerAppointment;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getHandlingContent() {
        return handlingContent;
    }

    public void setHandlingContent(String handlingContent) {
        this.handlingContent = handlingContent;
    }

    public String getHandlingUnit() {
        return handlingUnit;
    }

    public void setHandlingUnit(String handlingUnit) {
        this.handlingUnit = handlingUnit;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public String getHandlingResult() {
        return handlingResult;
    }

    public void setHandlingResult(String handlingResult) {
        this.handlingResult = handlingResult;
    }

    public String getLastHandler() {
        return lastHandler;
    }

    public void setLastHandler(String lastHandler) {
        this.lastHandler = lastHandler;
    }

    public LocalDate getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
    }

    public LocalTime getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(LocalTime closedTime) {
        this.closedTime = closedTime;
    }

    public String getComplaintLevel() {
        return complaintLevel;
    }

    public void setComplaintLevel(String complaintLevel) {
        this.complaintLevel = complaintLevel;
    }

    public String getArisingError() {
        return arisingError;
    }

    public void setArisingError(String arisingError) {
        this.arisingError = arisingError;
    }

    public LocalDate getCustomerFeedbackDate() {
        return customerFeedbackDate;
    }

    public void setCustomerFeedbackDate(LocalDate customerFeedbackDate) {
        this.customerFeedbackDate = customerFeedbackDate;
    }

    public LocalDate getFeedbackAppointmentDate() {
        return feedbackAppointmentDate;
    }

    public void setFeedbackAppointmentDate(LocalDate feedbackAppointmentDate) {
        this.feedbackAppointmentDate = feedbackAppointmentDate;
    }

    public String getSatisfactionLevel() {
        return satisfactionLevel;
    }

    public void setSatisfactionLevel(String satisfactionLevel) {
        this.satisfactionLevel = satisfactionLevel;
    }

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getDuplicateId() {
        return duplicateId;
    }

    public void setDuplicateId(String duplicateId) {
        this.duplicateId = duplicateId;
    }

    public String getReceptionSource() {
        return receptionSource;
    }

    public void setReceptionSource(String receptionSource) {
        this.receptionSource = receptionSource;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getReceptionChannel() {
        return receptionChannel;
    }

    public void setReceptionChannel(String receptionChannel) {
        this.receptionChannel = receptionChannel;
    }

    public String getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(String packageInfo) {
        this.packageInfo = packageInfo;
    }

    public Integer getTotalProcessingHours() {
        return totalProcessingHours;
    }

    public void setTotalProcessingHours(Integer totalProcessingHours) {
        this.totalProcessingHours = totalProcessingHours;
    }

    public String getDslamDlu() {
        return dslamDlu;
    }

    public void setDslamDlu(String dslamDlu) {
        this.dslamDlu = dslamDlu;
    }

    public String getRootCauseLvl1() {
        return rootCauseLvl1;
    }

    public void setRootCauseLvl1(String rootCauseLvl1) {
        this.rootCauseLvl1 = rootCauseLvl1;
    }

    public String getRootCauseLvl2() {
        return rootCauseLvl2;
    }

    public void setRootCauseLvl2(String rootCauseLvl2) {
        this.rootCauseLvl2 = rootCauseLvl2;
    }

    public String getRootCauseLvl3() {
        return rootCauseLvl3;
    }

    public void setRootCauseLvl3(String rootCauseLvl3) {
        this.rootCauseLvl3 = rootCauseLvl3;
    }

    public String getRootCauseLvl4() {
        return rootCauseLvl4;
    }

    public void setRootCauseLvl4(String rootCauseLvl4) {
        this.rootCauseLvl4 = rootCauseLvl4;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAssigner() {
        return assigner;
    }

    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Integer getOverdueHours() {
        return overdueHours;
    }

    public void setOverdueHours(Integer overdueHours) {
        this.overdueHours = overdueHours;
    }

    public String getPreliminaryHandling() {
        return preliminaryHandling;
    }

    public void setPreliminaryHandling(String preliminaryHandling) {
        this.preliminaryHandling = preliminaryHandling;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getSms1715() {
        return sms1715;
    }

    public void setSms1715(String sms1715) {
        this.sms1715 = sms1715;
    }

    public String getWeakPointCode() {
        return weakPointCode;
    }

    public void setWeakPointCode(String weakPointCode) {
        this.weakPointCode = weakPointCode;
    }

    public String getResponsibleUnit() {
        return responsibleUnit;
    }

    public void setResponsibleUnit(String responsibleUnit) {
        this.responsibleUnit = responsibleUnit;
    }

    public String getLocalStaffId() {
        return localStaffId;
    }

    public void setLocalStaffId(String localStaffId) {
        this.localStaffId = localStaffId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(String customerDetail) {
        this.customerDetail = customerDetail;
    }

    public String getSubscriberStatus() {
        return subscriberStatus;
    }

    public void setSubscriberStatus(String subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }

    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public String getOverdueCauseLvl1() {
        return overdueCauseLvl1;
    }

    public void setOverdueCauseLvl1(String overdueCauseLvl1) {
        this.overdueCauseLvl1 = overdueCauseLvl1;
    }

    public String getOverdueCauseLvl2() {
        return overdueCauseLvl2;
    }

    public void setOverdueCauseLvl2(String overdueCauseLvl2) {
        this.overdueCauseLvl2 = overdueCauseLvl2;
    }

    public String getOverdueDepartment() {
        return overdueDepartment;
    }

    public void setOverdueDepartment(String overdueDepartment) {
        this.overdueDepartment = overdueDepartment;
    }

    public String getNtmsUnit() {
        return ntmsUnit;
    }

    public void setNtmsUnit(String ntmsUnit) {
        this.ntmsUnit = ntmsUnit;
    }

    public String getNtmsStaff() {
        return ntmsStaff;
    }

    public void setNtmsStaff(String ntmsStaff) {
        this.ntmsStaff = ntmsStaff;
    }

    public Integer getAppointmentCount() {
        return appointmentCount;
    }

    public void setAppointmentCount(Integer appointmentCount) {
        this.appointmentCount = appointmentCount;
    }

    public Integer getSuccessfulAppointments() {
        return successfulAppointments;
    }

    public void setSuccessfulAppointments(Integer successfulAppointments) {
        this.successfulAppointments = successfulAppointments;
    }

    public Integer getFailedAppointments() {
        return failedAppointments;
    }

    public void setFailedAppointments(Integer failedAppointments) {
        this.failedAppointments = failedAppointments;
    }

    public Integer getPendingAppointments() {
        return pendingAppointments;
    }

    public void setPendingAppointments(Integer pendingAppointments) {
        this.pendingAppointments = pendingAppointments;
    }

    public String getAppointmentUser() {
        return appointmentUser;
    }

    public void setAppointmentUser(String appointmentUser) {
        this.appointmentUser = appointmentUser;
    }

    public String getAppointmentEvaluation() {
        return appointmentEvaluation;
    }

    public void setAppointmentEvaluation(String appointmentEvaluation) {
        this.appointmentEvaluation = appointmentEvaluation;
    }

    public String getAonGpon() {
        return aonGpon;
    }

    public void setAonGpon(String aonGpon) {
        this.aonGpon = aonGpon;
    }

    public String getCoordinationUnitType() {
        return coordinationUnitType;
    }

    public void setCoordinationUnitType(String coordinationUnitType) {
        this.coordinationUnitType = coordinationUnitType;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getSubscriberCode() {
        return subscriberCode;
    }

    public void setSubscriberCode(String subscriberCode) {
        this.subscriberCode = subscriberCode;
    }

    public Integer getGnocProcessingHours() {
        return gnocProcessingHours;
    }

    public void setGnocProcessingHours(Integer gnocProcessingHours) {
        this.gnocProcessingHours = gnocProcessingHours;
    }

    public String getSatisfactionLvl2() {
        return satisfactionLvl2;
    }

    public void setSatisfactionLvl2(String satisfactionLvl2) {
        this.satisfactionLvl2 = satisfactionLvl2;
    }

    public String getComplaintEval() {
        return complaintEval;
    }

    public void setComplaintEval(String complaintEval) {
        this.complaintEval = complaintEval;
    }

    public LocalDateTime getNtmsExpectedCompletion() {
        return ntmsExpectedCompletion;
    }

    public void setNtmsExpectedCompletion(LocalDateTime ntmsExpectedCompletion) {
        this.ntmsExpectedCompletion = ntmsExpectedCompletion;
    }

    public String getSms1715Content() {
        return sms1715Content;
    }

    public void setSms1715Content(String sms1715Content) {
        this.sms1715Content = sms1715Content;
    }

    public String getCoordinationStatus() {
        return coordinationStatus;
    }

    public void setCoordinationStatus(String coordinationStatus) {
        this.coordinationStatus = coordinationStatus;
    }

    public String getReceivingDepartment() {
        return receivingDepartment;
    }

    public void setReceivingDepartment(String receivingDepartment) {
        this.receivingDepartment = receivingDepartment;
    }

    public String getCoordinationUnit() {
        return coordinationUnit;
    }

    public void setCoordinationUnit(String coordinationUnit) {
        this.coordinationUnit = coordinationUnit;
    }

    public LocalDateTime getTechAppointmentTime() {
        return techAppointmentTime;
    }

    public void setTechAppointmentTime(LocalDateTime techAppointmentTime) {
        this.techAppointmentTime = techAppointmentTime;
    }

    public String getCoordinationResult() {
        return coordinationResult;
    }

    public void setCoordinationResult(String coordinationResult) {
        this.coordinationResult = coordinationResult;
    }

    public String getCoordinationFailureCause() {
        return coordinationFailureCause;
    }

    public void setCoordinationFailureCause(String coordinationFailureCause) {
        this.coordinationFailureCause = coordinationFailureCause;
    }

    public Integer getSpmProcessingHours() {
        return spmProcessingHours;
    }

    public void setSpmProcessingHours(Integer spmProcessingHours) {
        this.spmProcessingHours = spmProcessingHours;
    }

    public String getGnocProgress() {
        return gnocProgress;
    }

    public void setGnocProgress(String gnocProgress) {
        this.gnocProgress = gnocProgress;
    }

    public Integer getGnocAppointmentHours() {
        return gnocAppointmentHours;
    }

    public void setGnocAppointmentHours(Integer gnocAppointmentHours) {
        this.gnocAppointmentHours = gnocAppointmentHours;
    }

    public LocalDate getIncidentCompletedDate() {
        return incidentCompletedDate;
    }

    public void setIncidentCompletedDate(LocalDate incidentCompletedDate) {
        this.incidentCompletedDate = incidentCompletedDate;
    }

    public LocalTime getIncidentCompletedTime() {
        return incidentCompletedTime;
    }

    public void setIncidentCompletedTime(LocalTime incidentCompletedTime) {
        this.incidentCompletedTime = incidentCompletedTime;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getFtCdReject() {
        return ftCdReject;
    }

    public void setFtCdReject(String ftCdReject) {
        this.ftCdReject = ftCdReject;
    }

    public Boolean getVipCustomer() {
        return vipCustomer;
    }

    public void setVipCustomer(Boolean vipCustomer) {
        this.vipCustomer = vipCustomer;
    }

    public String getCriticalPoint() {
        return criticalPoint;
    }

    public void setCriticalPoint(String criticalPoint) {
        this.criticalPoint = criticalPoint;
    }

    public String getCustomerClassification() {
        return customerClassification;
    }

    public void setCustomerClassification(String customerClassification) {
        this.customerClassification = customerClassification;
    }

    public String getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getArpuInfo() {
        return arpuInfo;
    }

    public void setArpuInfo(String arpuInfo) {
        this.arpuInfo = arpuInfo;
    }

    public LocalDateTime getHotTrackingTime() {
        return hotTrackingTime;
    }

    public void setHotTrackingTime(LocalDateTime hotTrackingTime) {
        this.hotTrackingTime = hotTrackingTime;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getDetailedResult() {
        return detailedResult;
    }

    public void setDetailedResult(String detailedResult) {
        this.detailedResult = detailedResult;
    }

    public LocalDateTime getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(LocalDateTime responseTime) {
        this.responseTime = responseTime;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getWorkorderCode() {
        return workorderCode;
    }

    public void setWorkorderCode(String workorderCode) {
        this.workorderCode = workorderCode;
    }

    public String getGnocCellId() {
        return gnocCellId;
    }

    public void setGnocCellId(String gnocCellId) {
        this.gnocCellId = gnocCellId;
    }

    public String getCriticalChannel() {
        return criticalChannel;
    }

    public void setCriticalChannel(String criticalChannel) {
        this.criticalChannel = criticalChannel;
    }

    public String getHandlingPriority() {
        return handlingPriority;
    }

    public void setHandlingPriority(String handlingPriority) {
        this.handlingPriority = handlingPriority;
    }

    public String getHandlingMethod() {
        return handlingMethod;
    }

    public void setHandlingMethod(String handlingMethod) {
        this.handlingMethod = handlingMethod;
    }

    public String getGLine() {
        return gLine;
    }

    public void setGLine(String gLine) {
        this.gLine = gLine;
    }

    public String getSubscriberCableLength() {
        return subscriberCableLength;
    }

    public void setSubscriberCableLength(String subscriberCableLength) {
        this.subscriberCableLength = subscriberCableLength;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public String getTicketClosureSource() {
        return ticketClosureSource;
    }

    public void setTicketClosureSource(String ticketClosureSource) {
        this.ticketClosureSource = ticketClosureSource;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelRequestSubscriber() {
        return cancelRequestSubscriber;
    }

    public void setCancelRequestSubscriber(String cancelRequestSubscriber) {
        this.cancelRequestSubscriber = cancelRequestSubscriber;
    }

    public Integer getActualProcessingHours() {
        return actualProcessingHours;
    }

    public void setActualProcessingHours(Integer actualProcessingHours) {
        this.actualProcessingHours = actualProcessingHours;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public String getExplanationBranch() {
        return explanationBranch;
    }

    public void setExplanationBranch(String explanationBranch) {
        this.explanationBranch = explanationBranch;
    }

    public String getTransactionStore() {
        return transactionStore;
    }

    public void setTransactionStore(String transactionStore) {
        this.transactionStore = transactionStore;
    }

    public String getHamlet() {
        return hamlet;
    }

    public void setHamlet(String hamlet) {
        this.hamlet = hamlet;
    }

    public LocalDateTime getGnocCompletionTime1() {
        return gnocCompletionTime1;
    }

    public void setGnocCompletionTime1(LocalDateTime gnocCompletionTime1) {
        this.gnocCompletionTime1 = gnocCompletionTime1;
    }

    public LocalDate getFeedbackDeadline() {
        return feedbackDeadline;
    }

    public void setFeedbackDeadline(LocalDate feedbackDeadline) {
        this.feedbackDeadline = feedbackDeadline;
    }

    public LocalDate getErrorTransferDate() {
        return errorTransferDate;
    }

    public void setErrorTransferDate(LocalDate errorTransferDate) {
        this.errorTransferDate = errorTransferDate;
    }

    public String getTechFeedbackContent() {
        return techFeedbackContent;
    }

    public void setTechFeedbackContent(String techFeedbackContent) {
        this.techFeedbackContent = techFeedbackContent;
    }

    public String getCskhFeedbackStatus() {
        return cskhFeedbackStatus;
    }

    public void setCskhFeedbackStatus(String cskhFeedbackStatus) {
        this.cskhFeedbackStatus = cskhFeedbackStatus;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getViolatorName() {
        return violatorName;
    }

    public void setViolatorName(String violatorName) {
        this.violatorName = violatorName;
    }

    public String getViolatorCardId() {
        return violatorCardId;
    }

    public void setViolatorCardId(String violatorCardId) {
        this.violatorCardId = violatorCardId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTechnicalContactPoint() {
        return technicalContactPoint;
    }

    public void setTechnicalContactPoint(String technicalContactPoint) {
        this.technicalContactPoint = technicalContactPoint;
    }

    public String getKvRegion() {
        return kvRegion;
    }

    public void setKvRegion(String kvRegion) {
        this.kvRegion = kvRegion;
    }

    public String getHappyCallStaff() {
        return happyCallStaff;
    }

    public void setHappyCallStaff(String happyCallStaff) {
        this.happyCallStaff = happyCallStaff;
    }

    public String getHpcResult() {
        return hpcResult;
    }

    public void setHpcResult(String hpcResult) {
        this.hpcResult = hpcResult;
    }

    public String getHpcResultDetail() {
        return hpcResultDetail;
    }

    public void setHpcResultDetail(String hpcResultDetail) {
        this.hpcResultDetail = hpcResultDetail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getProcessingObject() {
        return processingObject;
    }

    public void setProcessingObject(String processingObject) {
        this.processingObject = processingObject;
    }

    public String getNewProvince() {
        return newProvince;
    }

    public void setNewProvince(String newProvince) {
        this.newProvince = newProvince;
    }

    public String getNewWard() {
        return newWard;
    }

    public void setNewWard(String newWard) {
        this.newWard = newWard;
    }
}