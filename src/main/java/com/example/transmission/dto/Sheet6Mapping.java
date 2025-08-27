package com.example.transmission.dto;

import com.example.transmission.domain.Complaint;
import com.example.transmission.service.ComplaintService;

public class Sheet6Mapping {
    
    public static final ColumnMapping[] MAPPINGS = createMappings();

    public static ColumnMapping[] createMappings() {
        return new ColumnMapping[] {
            // Basic Information (H - M)
            new ColumnMapping("H", "complaintId", Complaint::getComplaintId),
            new ColumnMapping("I", "subscriberNumber", Complaint::getSubscriberNumber),
            new ColumnMapping("J", "complainantName", Complaint::getComplainantName),
            new ColumnMapping("K", "complainantAddress", Complaint::getComplainantAddress),
            new ColumnMapping("L", "contactCount", Complaint::getContactCount),
            new ColumnMapping("M", "receiverName", Complaint::getReceiverName),
            
            // Date & Time Information (N - O)
            new ColumnMapping("N", "receivedDate", Complaint::getReceivedDate, ComplaintService::formatLocalDate),
            new ColumnMapping("O", "receivedTime", Complaint::getReceivedTime, ComplaintService::formatLocalTime),
            
            // Complaint Details (P - U)
            new ColumnMapping("P", "complaintGroup", Complaint::getComplaintGroup),
            new ColumnMapping("Q", "category", Complaint::getCategory),
            new ColumnMapping("R", "complaintType", Complaint::getComplaintType),
            new ColumnMapping("S", "receptionMethod", Complaint::getReceptionMethod),
            new ColumnMapping("T", "priorityLevel", Complaint::getPriorityLevel),
            new ColumnMapping("U", "complaintContent", Complaint::getComplaintContent),
            
            // Appointment Information (V - Z)
            new ColumnMapping("V", "latestCustomerAppointment", Complaint::getLatestCustomerAppointment, ComplaintService::formatLocalDate),
            new ColumnMapping("W", "deadlineDate", Complaint::getDeadlineDate, ComplaintService::formatLocalDate),
            new ColumnMapping("X", "handlingContent", Complaint::getHandlingContent),
            new ColumnMapping("Y", "handlingUnit", Complaint::getHandlingUnit),
            new ColumnMapping("Z", "appointmentDate", Complaint::getAppointmentDate, ComplaintService::formatLocalDate),
            
            // Status & Results (AA - AE)
            new ColumnMapping("AA", "complaintStatus", Complaint::getComplaintStatus),
            new ColumnMapping("AB", "handlingResult", Complaint::getHandlingResult),
            new ColumnMapping("AC", "lastHandler", Complaint::getLastHandler),
            new ColumnMapping("AD", "closedDate", Complaint::getClosedDate, ComplaintService::formatLocalDate),
            new ColumnMapping("AE", "closedTime", Complaint::getClosedTime, ComplaintService::formatLocalTime),
            
            // Additional Details (AF - AL)
            new ColumnMapping("AF", "complaintLevel", Complaint::getComplaintLevel),
            new ColumnMapping("AG", "arisingError", Complaint::getArisingError),
            new ColumnMapping("AH", "customerFeedbackDate", Complaint::getCustomerFeedbackDate, ComplaintService::formatLocalDate),
            new ColumnMapping("AI", "feedbackAppointmentDate", Complaint::getFeedbackAppointmentDate, ComplaintService::formatLocalDate),
            new ColumnMapping("AJ", "satisfactionLevel", Complaint::getSatisfactionLevel),
            new ColumnMapping("AK", "returnResult", Complaint::getReturnResult),
            new ColumnMapping("AL", "returnReason", Complaint::getReturnReason),
            
            // Location & Source (AM - AR)
            new ColumnMapping("AM", "duplicateId", Complaint::getDuplicateId),
            new ColumnMapping("AN", "receptionSource", Complaint::getReceptionSource),
            new ColumnMapping("AO", "district", Complaint::getDistrict),
            new ColumnMapping("AP", "ward", Complaint::getWard),
            new ColumnMapping("AQ", "receptionChannel", Complaint::getReceptionChannel),
            new ColumnMapping("AR", "packageInfo", Complaint::getPackageInfo),
            
            // Technical Information (AS - AX)
            new ColumnMapping("AS", "totalProcessingHours", Complaint::getTotalProcessingHours),
            new ColumnMapping("AT", "dslamDlu", Complaint::getDslamDlu),
            new ColumnMapping("AU", "rootCauseLvl1", Complaint::getRootCauseLvl1),
            new ColumnMapping("AV", "rootCauseLvl2", Complaint::getRootCauseLvl2),
            new ColumnMapping("AW", "rootCauseLvl3", Complaint::getRootCauseLvl3),
            new ColumnMapping("AX", "rootCauseLvl4", Complaint::getRootCauseLvl4),
            
            // Contract & Assignment (AY - BD)
            new ColumnMapping("AY", "contractNumber", Complaint::getContractNumber),
            new ColumnMapping("AZ", "note", Complaint::getNote),
            new ColumnMapping("BA", "assigner", Complaint::getAssigner),
            new ColumnMapping("BB", "assignee", Complaint::getAssignee),
            new ColumnMapping("BC", "progress", Complaint::getProgress),
            new ColumnMapping("BD", "overdueHours", Complaint::getOverdueHours),
            
            // Contact & Additional Info (BE - BI)
            new ColumnMapping("BE", "preliminaryHandling", Complaint::getPreliminaryHandling),
            new ColumnMapping("BF", "contactNumber", Complaint::getContactNumber),
            new ColumnMapping("BG", "additionalInfo", Complaint::getAdditionalInfo),
            new ColumnMapping("BH", "sms1715", Complaint::getSms1715),
            new ColumnMapping("BI", "weakPointCode", Complaint::getWeakPointCode),
            
            // Customer & Service Info (BJ - BO)
            new ColumnMapping("BJ", "responsibleUnit", Complaint::getResponsibleUnit),
            new ColumnMapping("BK", "localStaffId", Complaint::getLocalStaffId),
            new ColumnMapping("BL", "serviceType", Complaint::getServiceType),
            new ColumnMapping("BM", "customerType", Complaint::getCustomerType),
            new ColumnMapping("BN", "customerDetail", Complaint::getCustomerDetail),
            new ColumnMapping("BO", "subscriberStatus", Complaint::getSubscriberStatus),
            
            // Overdue Information (BP - BU)
            new ColumnMapping("BP", "subscriptionStatus", Complaint::getSubscriptionStatus),
            new ColumnMapping("BQ", "overdueCauseLvl1", Complaint::getOverdueCauseLvl1),
            new ColumnMapping("BR", "overdueCauseLvl2", Complaint::getOverdueCauseLvl2),
            new ColumnMapping("BS", "overdueDepartment", Complaint::getOverdueDepartment),
            new ColumnMapping("BT", "ntmsUnit", Complaint::getNtmsUnit),
            new ColumnMapping("BU", "ntmsStaff", Complaint::getNtmsStaff),
            
            // Appointment Statistics (BV - CA)
            new ColumnMapping("BV", "appointmentCount", Complaint::getAppointmentCount),
            new ColumnMapping("BW", "successfulAppointments", Complaint::getSuccessfulAppointments),
            new ColumnMapping("BX", "failedAppointments", Complaint::getFailedAppointments),
            new ColumnMapping("BY", "pendingAppointments", Complaint::getPendingAppointments),
            new ColumnMapping("BZ", "appointmentUser", Complaint::getAppointmentUser),
            new ColumnMapping("CA", "appointmentEvaluation", Complaint::getAppointmentEvaluation),
            
            // Technical & Coordination (CB - CO)
            new ColumnMapping("CB", "aonGpon", Complaint::getAonGpon),
            new ColumnMapping("CC", "coordinationUnitType", Complaint::getCoordinationUnitType),
            new ColumnMapping("CD", "noteContent", Complaint::getNoteContent),
            new ColumnMapping("CE", "subscriberCode", Complaint::getSubscriberCode),
            new ColumnMapping("CF", "gnocProcessingHours", Complaint::getGnocProcessingHours),
            new ColumnMapping("CG", "satisfactionLvl2", Complaint::getSatisfactionLvl2),
            new ColumnMapping("CH", "complaintEval", Complaint::getComplaintEval),
            new ColumnMapping("CI", "ntmsExpectedCompletion", Complaint::getNtmsExpectedCompletion, ComplaintService::formatLocalDateTime),
            new ColumnMapping("CJ", "sms1715Content", Complaint::getSms1715Content),
            new ColumnMapping("CK", "coordinationStatus", Complaint::getCoordinationStatus),
            new ColumnMapping("CL", "receivingDepartment", Complaint::getReceivingDepartment),
            new ColumnMapping("CM", "coordinationUnit", Complaint::getCoordinationUnit),
            new ColumnMapping("CN", "techAppointmentTime", Complaint::getTechAppointmentTime, ComplaintService::formatLocalDateTime),
            new ColumnMapping("CO", "coordinationResult", Complaint::getCoordinationResult),
            
            // Processing & Progress (CP - DY)
            new ColumnMapping("CP", "coordinationFailureCause", Complaint::getCoordinationFailureCause),
            new ColumnMapping("CQ", "spmProcessingHours", Complaint::getSpmProcessingHours),
            new ColumnMapping("CR", "gnocProgress", Complaint::getGnocProgress),
            new ColumnMapping("CS", "gnocAppointmentHours", Complaint::getGnocAppointmentHours),
            new ColumnMapping("CT", "incidentCompletedDate", Complaint::getIncidentCompletedDate, ComplaintService::formatLocalDate),
            new ColumnMapping("CU", "incidentCompletedTime", Complaint::getIncidentCompletedTime, ComplaintService::formatLocalTime),
            new ColumnMapping("CV", "errorCode", Complaint::getErrorCode),
            new ColumnMapping("CW", "ftCdReject", Complaint::getFtCdReject),
            new ColumnMapping("CX", "vipCustomer", Complaint::getVipCustomer),
            new ColumnMapping("CY", "criticalPoint", Complaint::getCriticalPoint),
            new ColumnMapping("CZ", "customerClassification", Complaint::getCustomerClassification),
            new ColumnMapping("DA", "subscriber", Complaint::getSubscriber),
            new ColumnMapping("DB", "segment", Complaint::getSegment),
            new ColumnMapping("DC", "paymentMethod", Complaint::getPaymentMethod),
            new ColumnMapping("DD", "arpuInfo", Complaint::getArpuInfo),
            new ColumnMapping("DE", "hotTrackingTime", Complaint::getHotTrackingTime, ComplaintService::formatLocalDateTime),
            
            // Error & Solution (DF - DI)
            new ColumnMapping("DF", "jobStatus", Complaint::getJobStatus),
            new ColumnMapping("DG", "errorDescription", Complaint::getErrorDescription),
            new ColumnMapping("DH", "cause", Complaint::getCause),
            new ColumnMapping("DI", "solution", Complaint::getSolution),
            
            // Response & Tracking (DJ - DO)
            new ColumnMapping("DJ", "detailedResult", Complaint::getDetailedResult),
            new ColumnMapping("DK", "responseTime", Complaint::getResponseTime, ComplaintService::formatLocalDateTime),
            new ColumnMapping("DL", "ticketCode", Complaint::getTicketCode),
            new ColumnMapping("DM", "workorderCode", Complaint::getWorkorderCode),
            new ColumnMapping("DN", "gnocCellId", Complaint::getGnocCellId),
            new ColumnMapping("DO", "criticalChannel", Complaint::getCriticalChannel),
            
            // Technical Details (DP - DU)
            new ColumnMapping("DP", "handlingPriority", Complaint::getHandlingPriority),
            new ColumnMapping("DQ", "handlingMethod", Complaint::getHandlingMethod),
            new ColumnMapping("DR", "gLine", Complaint::getGLine),
            new ColumnMapping("DS", "subscriberCableLength", Complaint::getSubscriberCableLength),
            new ColumnMapping("DT", "projectCode", Complaint::getProjectCode),
            new ColumnMapping("DU", "projectName", Complaint::getProjectName),
            
            // Closure & Cancellation (DV - DY)
            new ColumnMapping("DV", "projectAddress", Complaint::getProjectAddress),
            new ColumnMapping("DW", "ticketClosureSource", Complaint::getTicketClosureSource),
            new ColumnMapping("DX", "cancelReason", Complaint::getCancelReason),
            new ColumnMapping("DY", "cancelRequestSubscriber", Complaint::getCancelRequestSubscriber),
            
            // Performance & Region (DZ - EC)
            new ColumnMapping("DZ", "actualProcessingHours", Complaint::getActualProcessingHours),
            new ColumnMapping("EA", "regionType", Complaint::getRegionType),
            new ColumnMapping("EB", "explanationBranch", Complaint::getExplanationBranch),
            new ColumnMapping("EC", "transactionStore", Complaint::getTransactionStore),
            
            // Completion & Feedback (ED - EI)
            new ColumnMapping("ED", "hamlet", Complaint::getHamlet),
            new ColumnMapping("EE", "gnocCompletionTime1", Complaint::getGnocCompletionTime1, ComplaintService::formatLocalDateTime),
            new ColumnMapping("EF", "feedbackDeadline", Complaint::getFeedbackDeadline, ComplaintService::formatLocalDate),
            new ColumnMapping("EG", "errorTransferDate", Complaint::getErrorTransferDate, ComplaintService::formatLocalDate),
            new ColumnMapping("EH", "techFeedbackContent", Complaint::getTechFeedbackContent),
            new ColumnMapping("EI", "cskhFeedbackStatus", Complaint::getCskhFeedbackStatus),
            
            // Violation & Contact (EJ - EO)
            new ColumnMapping("EJ", "penalty", Complaint::getPenalty),
            new ColumnMapping("EK", "violatorName", Complaint::getViolatorName),
            new ColumnMapping("EL", "violatorCardId", Complaint::getViolatorCardId),
            new ColumnMapping("EM", "email", Complaint::getEmail),
            new ColumnMapping("EN", "phoneNumber", Complaint::getPhoneNumber),
            new ColumnMapping("EO", "technicalContactPoint", Complaint::getTechnicalContactPoint),
            
            // Region & Staff (EP - EW)
            new ColumnMapping("EP", "kvRegion", Complaint::getKvRegion),
            new ColumnMapping("EQ", "happyCallStaff", Complaint::getHappyCallStaff),
            new ColumnMapping("ER", "hpcResult", Complaint::getHpcResult),
            new ColumnMapping("ES", "hpcResultDetail", Complaint::getHpcResultDetail),
            new ColumnMapping("ET", "contactPhone", Complaint::getContactPhone),
            new ColumnMapping("EU", "processingObject", Complaint::getProcessingObject),
            new ColumnMapping("EV", "newProvince", Complaint::getNewProvince),
            new ColumnMapping("EW", "newWard", Complaint::getNewWard)
        };
    }
}
