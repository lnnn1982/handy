package com.ece651.handymenserver.Domain;

import java.util.*;

public interface HandyMenUserProfileDao {
    void addUserBasicInfo(HandyMenUserContactInfo contactInfo,
    		HandyMenUserAuth auth) throws Exception;
    void updateUserContactInfo(HandyMenUserContactInfo contactInfo) throws Exception;
    
    void addUserServiceInfo(HandyMenUsrServiceInfo serviceInfo) throws Exception;
    void updateUserServiceInfo(HandyMenUsrServiceInfo serviceInfo) throws Exception;
    void deleteServiceInfo(String userName, String type) throws Exception;
    
    List<HandyMenSvrTypeInfo> listServiceTypeInfos() throws Exception;
    void setOneServiceTypeInfo(int svrTypeId, String svrTypeUploadFileNames,
    		String svrTypePrice, String occasion) throws Exception;
    HandyMenSvrTypeInfo getOneServieTypeInfo(String svrType) throws Exception;
    
    HandyMenUserProfile getUser(String usrName)throws Exception;
    void deleteUser(String userName)throws Exception;
    
    Boolean isUserExit(String usrName);
    Boolean isEmailExit(String emailAddr);
    Boolean checkUserAndEmail(String usrName, String emailAddr);
    Boolean isUsrServiceTypeExist(String usrName, String serviceType);
    
    List<HandyMenUserProfile> listFullUserProfiles() throws Exception;
    List<HandyMenUserProfile> listSimpleUserProfiles() throws Exception;    
    
    List<HandyMenUserProfile> listFullUserProfilesBySvrType(
    		String serviceType) throws Exception;
    List<HandyMenUserProfile> listSimpleUserProfilesBySvrType(
    		String serviceType) throws Exception;
    
    void updatePasswd(String usr, String passwd) throws Exception;
    HandyMenUserAuth getUsrAuth(String usrName)throws Exception;
    
    Boolean isUserPasswordValid(String usrName, String passwd)throws Exception;
}
