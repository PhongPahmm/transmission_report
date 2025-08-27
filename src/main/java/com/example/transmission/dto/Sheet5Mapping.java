package com.example.transmission.dto;

import com.example.transmission.domain.Complaint;
import com.example.transmission.service.ComplaintService;

public class Sheet5Mapping {
    
    public static final ColumnMapping[] MAPPINGS = createMappings();

     public static ColumnMapping[] createMappings() {
        return new ColumnMapping[] {
            // Basic Information (AG - AL)
            new ColumnMapping("AG", "complaintId", Complaint::getComplaintId),
            new ColumnMapping("AH", "subscriberNumber", Complaint::getSubscriberNumber),
            new ColumnMapping("AI", "complainantName", Complaint::getComplainantName),
            new ColumnMapping("AJ", "complainantAddress", Complaint::getComplainantAddress),
            new ColumnMapping("AK", "contactCount", Complaint::getContactCount),
            new ColumnMapping("AL", "receiverName", Complaint::getReceiverName),
            
            // Date & Time Information (AM - AN)
            new ColumnMapping("AM", "receivedDate", Complaint::getReceivedDate, ComplaintService::formatLocalDate),
            new ColumnMapping("AN", "receivedTime", Complaint::getReceivedTime, ComplaintService::formatLocalTime),
            
            // Complaint Details (AO - AT)
            new ColumnMapping("AO", "complaintGroup", Complaint::getComplaintGroup),
            new ColumnMapping("AP", "category", Complaint::getCategory),
            new ColumnMapping("AQ", "complaintType", Complaint::getComplaintType),
            new ColumnMapping("AR", "receptionMethod", Complaint::getReceptionMethod),
            new ColumnMapping("AS", "priorityLevel", Complaint::getPriorityLevel),
            new ColumnMapping("AT", "complaintContent", Complaint::getComplaintContent),
            
            // Appointment Information (AU - AY)
            new ColumnMapping("AU", "latestCustomerAppointment", Complaint::getLatestCustomerAppointment, ComplaintService::formatLocalDate),
            new ColumnMapping("AV", "deadlineDate", Complaint::getDeadlineDate, ComplaintService::formatLocalDate),
            new ColumnMapping("AW", "handlingContent", Complaint::getHandlingContent),
            new ColumnMapping("AX", "handlingUnit", Complaint::getHandlingUnit),
            new ColumnMapping("AY", "appointmentDate", Complaint::getAppointmentDate, ComplaintService::formatLocalDate),
            
            // Status & Results (AZ - BD)
            new ColumnMapping("AZ", "complaintStatus", Complaint::getComplaintStatus),
            new ColumnMapping("BA", "handlingResult", Complaint::getHandlingResult),
            new ColumnMapping("BB", "lastHandler", Complaint::getLastHandler),
            new ColumnMapping("BC", "closedDate", Complaint::getClosedDate, ComplaintService::formatLocalDate),
            new ColumnMapping("BD", "closedTime", Complaint::getClosedTime, ComplaintService::formatLocalTime),
            
            // Additional Details (BE - BK)
            new ColumnMapping("BE", "complaintLevel", Complaint::getComplaintLevel),
            new ColumnMapping("BF", "arisingError", Complaint::getArisingError),
            new ColumnMapping("BG", "customerFeedbackDate", Complaint::getCustomerFeedbackDate, ComplaintService::formatLocalDate),
            new ColumnMapping("BH", "feedbackAppointmentDate", Complaint::getFeedbackAppointmentDate, ComplaintService::formatLocalDate),
            new ColumnMapping("BI", "satisfactionLevel", Complaint::getSatisfactionLevel),
            new ColumnMapping("BJ", "returnResult", Complaint::getReturnResult),
            new ColumnMapping("BK", "returnReason", Complaint::getReturnReason),
            
            // Location & Source (BL - BQ)
            new ColumnMapping("BL", "duplicateId", Complaint::getDuplicateId),
            new ColumnMapping("BM", "receptionSource", Complaint::getReceptionSource),
            new ColumnMapping("BN", "district", Complaint::getDistrict),
            new ColumnMapping("BO", "ward", Complaint::getWard),
            new ColumnMapping("BP", "receptionChannel", Complaint::getReceptionChannel),
            new ColumnMapping("BQ", "packageInfo", Complaint::getPackageInfo),
            
            // Technical Information (BR - BW)
            new ColumnMapping("BR", "totalProcessingHours", Complaint::getTotalProcessingHours),
            new ColumnMapping("BS", "dslamDlu", Complaint::getDslamDlu),
            new ColumnMapping("BT", "rootCauseLvl1", Complaint::getRootCauseLvl1),
            new ColumnMapping("BU", "rootCauseLvl2", Complaint::getRootCauseLvl2),
            new ColumnMapping("BV", "rootCauseLvl3", Complaint::getRootCauseLvl3),
            new ColumnMapping("BW", "rootCauseLvl4", Complaint::getRootCauseLvl4),
            
            // Contract & Assignment (BX - CC)
            new ColumnMapping("BX", "contractNumber", Complaint::getContractNumber),
            new ColumnMapping("BY", "note", Complaint::getNote),
            new ColumnMapping("BZ", "assigner", Complaint::getAssigner),
            new ColumnMapping("CA", "assignee", Complaint::getAssignee),
            new ColumnMapping("CB", "progress", Complaint::getProgress),
            new ColumnMapping("CC", "overdueHours", Complaint::getOverdueHours),
            
            // Contact & Additional Info (CD - CI)
            new ColumnMapping("CD", "preliminaryHandling", Complaint::getPreliminaryHandling),
            new ColumnMapping("CE", "contactNumber", Complaint::getContactNumber),
            new ColumnMapping("CF", "additionalInfo", Complaint::getAdditionalInfo),
            new ColumnMapping("CG", "sms1715", Complaint::getSms1715),
            new ColumnMapping("CH", "weakPointCode", Complaint::getWeakPointCode),
            new ColumnMapping("CI", "responsibleUnit", Complaint::getResponsibleUnit),
            
            // Customer & Service Info (CJ - CO)
            new ColumnMapping("CJ", "localStaffId", Complaint::getLocalStaffId),
            new ColumnMapping("CK", "serviceType", Complaint::getServiceType),
            new ColumnMapping("CL", "customerType", Complaint::getCustomerType),
            new ColumnMapping("CM", "customerDetail", Complaint::getCustomerDetail),
            new ColumnMapping("CN", "subscriberStatus", Complaint::getSubscriberStatus),
            new ColumnMapping("CO", "subscriptionStatus", Complaint::getSubscriptionStatus),
            
            // Overdue Information (CP - CT)
            new ColumnMapping("CP", "overdueCauseLvl1", Complaint::getOverdueCauseLvl1),
            new ColumnMapping("CQ", "overdueCauseLvl2", Complaint::getOverdueCauseLvl2),
            new ColumnMapping("CR", "overdueDepartment", Complaint::getOverdueDepartment),
            new ColumnMapping("CS", "ntmsUnit", Complaint::getNtmsUnit),
            new ColumnMapping("CT", "ntmsStaff", Complaint::getNtmsStaff),
            
            // Appointment Statistics (CU - CZ)
            new ColumnMapping("CU", "appointmentCount", Complaint::getAppointmentCount),
            new ColumnMapping("CV", "successfulAppointments", Complaint::getSuccessfulAppointments),
            new ColumnMapping("CW", "failedAppointments", Complaint::getFailedAppointments),
            new ColumnMapping("CX", "pendingAppointments", Complaint::getPendingAppointments),
            new ColumnMapping("CY", "appointmentUser", Complaint::getAppointmentUser),
            new ColumnMapping("CZ", "appointmentEvaluation", Complaint::getAppointmentEvaluation),
            
            // Technical & Coordination (DA - DO)
            new ColumnMapping("DA", "aonGpon", Complaint::getAonGpon),
            new ColumnMapping("DB", "coordinationUnitType", Complaint::getCoordinationUnitType),
            new ColumnMapping("DC", "noteContent", Complaint::getNoteContent),
            new ColumnMapping("DD", "subscriberCode", Complaint::getSubscriberCode),
            new ColumnMapping("DE", "gnocProcessingHours", Complaint::getGnocProcessingHours),
            new ColumnMapping("DF", "satisfactionLvl2", Complaint::getSatisfactionLvl2),
            new ColumnMapping("DG", "complaintEval", Complaint::getComplaintEval),
            new ColumnMapping("DH", "ntmsExpectedCompletion", Complaint::getNtmsExpectedCompletion, ComplaintService::formatLocalDateTime),
            new ColumnMapping("DI", "sms1715Content", Complaint::getSms1715Content),
            new ColumnMapping("DJ", "coordinationStatus", Complaint::getCoordinationStatus),
            new ColumnMapping("DK", "receivingDepartment", Complaint::getReceivingDepartment),
            new ColumnMapping("DL", "coordinationUnit", Complaint::getCoordinationUnit),
            new ColumnMapping("DM", "techAppointmentTime", Complaint::getTechAppointmentTime, ComplaintService::formatLocalDateTime),
            new ColumnMapping("DN", "coordinationResult", Complaint::getCoordinationResult),
            new ColumnMapping("DO", "coordinationFailureCause", Complaint::getCoordinationFailureCause),
            
            // Processing & Progress (DP - DY)
            new ColumnMapping("DP", "spmProcessingHours", Complaint::getSpmProcessingHours),
            new ColumnMapping("DQ", "gnocProgress", Complaint::getGnocProgress),
            new ColumnMapping("DR", "gnocAppointmentHours", Complaint::getGnocAppointmentHours),
            new ColumnMapping("DS", "incidentCompletedDate", Complaint::getIncidentCompletedDate, ComplaintService::formatLocalDate),
            new ColumnMapping("DT", "incidentCompletedTime", Complaint::getIncidentCompletedTime, ComplaintService::formatLocalTime),
            new ColumnMapping("DU", "errorCode", Complaint::getErrorCode),
            new ColumnMapping("DV", "ftCdReject", Complaint::getFtCdReject),
            new ColumnMapping("DW", "vipCustomer", Complaint::getVipCustomer),
            new ColumnMapping("DX", "criticalPoint", Complaint::getCriticalPoint),
            new ColumnMapping("DY", "customerClassification", Complaint::getCustomerClassification),
            
            // Customer & Business Info (DZ - ED)
            new ColumnMapping("DZ", "subscriber", Complaint::getSubscriber),
            new ColumnMapping("EA", "segment", Complaint::getSegment),
            new ColumnMapping("EB", "paymentMethod", Complaint::getPaymentMethod),
            new ColumnMapping("EC", "arpuInfo", Complaint::getArpuInfo),
            new ColumnMapping("ED", "hotTrackingTime", Complaint::getHotTrackingTime, ComplaintService::formatLocalDateTime),
            
            // Error & Solution (EE - EI)
            new ColumnMapping("EE", "jobStatus", Complaint::getJobStatus),
            new ColumnMapping("EF", "errorDescription", Complaint::getErrorDescription),
            new ColumnMapping("EG", "cause", Complaint::getCause),
            new ColumnMapping("EH", "solution", Complaint::getSolution),
            new ColumnMapping("EI", "detailedResult", Complaint::getDetailedResult),
            
            // Response & Tracking (EJ - EO)
            new ColumnMapping("EJ", "responseTime", Complaint::getResponseTime, ComplaintService::formatLocalDateTime),
            new ColumnMapping("EK", "ticketCode", Complaint::getTicketCode),
            new ColumnMapping("EL", "workorderCode", Complaint::getWorkorderCode),
            new ColumnMapping("EM", "gnocCellId", Complaint::getGnocCellId),
            new ColumnMapping("EN", "criticalChannel", Complaint::getCriticalChannel),
            new ColumnMapping("EO", "handlingPriority", Complaint::getHandlingPriority),
            
            // Technical Details (EP - EU)
            new ColumnMapping("EP", "handlingMethod", Complaint::getHandlingMethod),
            new ColumnMapping("EQ", "gLine", Complaint::getGLine),
            new ColumnMapping("ER", "subscriberCableLength", Complaint::getSubscriberCableLength),
            new ColumnMapping("ES", "projectCode", Complaint::getProjectCode),
            new ColumnMapping("ET", "projectName", Complaint::getProjectName),
            new ColumnMapping("EU", "projectAddress", Complaint::getProjectAddress),
            
            // Closure & Cancellation (EV - EX)
            new ColumnMapping("EV", "ticketClosureSource", Complaint::getTicketClosureSource),
            new ColumnMapping("EW", "cancelReason", Complaint::getCancelReason),
            new ColumnMapping("EX", "cancelRequestSubscriber", Complaint::getCancelRequestSubscriber),
            
            // Performance & Region (EY - FC)
            new ColumnMapping("EY", "actualProcessingHours", Complaint::getActualProcessingHours),
            new ColumnMapping("EZ", "regionType", Complaint::getRegionType),
            new ColumnMapping("FA", "explanationBranch", Complaint::getExplanationBranch),
            new ColumnMapping("FB", "transactionStore", Complaint::getTransactionStore),
            new ColumnMapping("FC", "hamlet", Complaint::getHamlet),
            
            // Completion & Feedback (FD - FH)
            new ColumnMapping("FD", "gnocCompletionTime1", Complaint::getGnocCompletionTime1, ComplaintService::formatLocalDateTime),
            new ColumnMapping("FE", "feedbackDeadline", Complaint::getFeedbackDeadline, ComplaintService::formatLocalDate),
            new ColumnMapping("FF", "errorTransferDate", Complaint::getErrorTransferDate, ComplaintService::formatLocalDate),
            new ColumnMapping("FG", "techFeedbackContent", Complaint::getTechFeedbackContent),
            new ColumnMapping("FH", "cskhFeedbackStatus", Complaint::getCskhFeedbackStatus),
            
            // Violation & Contact (FI - FN)
            new ColumnMapping("FI", "penalty", Complaint::getPenalty),
            new ColumnMapping("FJ", "violatorName", Complaint::getViolatorName),
            new ColumnMapping("FK", "violatorCardId", Complaint::getViolatorCardId),
            new ColumnMapping("FL", "email", Complaint::getEmail),
            new ColumnMapping("FM", "phoneNumber", Complaint::getPhoneNumber),
            new ColumnMapping("FN", "technicalContactPoint", Complaint::getTechnicalContactPoint),
            
            // Region & Staff (FO - FV)
            new ColumnMapping("FO", "kvRegion", Complaint::getKvRegion),
            new ColumnMapping("FP", "happyCallStaff", Complaint::getHappyCallStaff),
            new ColumnMapping("FQ", "hpcResult", Complaint::getHpcResult),
            new ColumnMapping("FR", "hpcResultDetail", Complaint::getHpcResultDetail),
            new ColumnMapping("FS", "contactPhone", Complaint::getContactPhone),
            new ColumnMapping("FT", "processingObject", Complaint::getProcessingObject),
            new ColumnMapping("FU", "newProvince", Complaint::getNewProvince),
            new ColumnMapping("FV", "newWard", Complaint::getNewWard)
        };
    }
}
