package com.sgs.model.entity;

import com.sgs.model.service.SGSAppModuleImpl;

import java.sql.Date;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 12 19:35:01 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsAccRecInvoicesImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AccRecInvoicesId,
        BuId,
        CustomersId,
        ProjectsId,
        BillTypeId,
        ServicesId,
        ArInvoiceNo,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        STATUS;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsAccRecInvoicesImpl.class);


    public static final int ACCRECINVOICESID = AttributesEnum.AccRecInvoicesId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CUSTOMERSID = AttributesEnum.CustomersId.index();
    public static final int PROJECTSID = AttributesEnum.ProjectsId.index();
    public static final int BILLTYPEID = AttributesEnum.BillTypeId.index();
    public static final int SERVICESID = AttributesEnum.ServicesId.index();
    public static final int ARINVOICENO = AttributesEnum.ArInvoiceNo.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int STATUS = AttributesEnum.STATUS.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsAccRecInvoicesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsAccRecInvoices");
    }


    /**
     * Gets the attribute value for AccRecInvoicesId, using the alias name AccRecInvoicesId.
     * @return the value of AccRecInvoicesId
     */
    public Integer getAccRecInvoicesId() {
        return (Integer) getAttributeInternal(ACCRECINVOICESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccRecInvoicesId.
     * @param value value to set the AccRecInvoicesId
     */
    public void setAccRecInvoicesId(Integer value) {
        setAttributeInternal(ACCRECINVOICESID, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the value of BuId
     */
    public Integer getBuId() {
        return (Integer) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(Integer value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for CustomersId, using the alias name CustomersId.
     * @return the value of CustomersId
     */
    public Integer getCustomersId() {
        return (Integer) getAttributeInternal(CUSTOMERSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomersId.
     * @param value value to set the CustomersId
     */
    public void setCustomersId(Integer value) {
        setAttributeInternal(CUSTOMERSID, value);
    }

    /**
     * Gets the attribute value for ProjectsId, using the alias name ProjectsId.
     * @return the value of ProjectsId
     */
    public Integer getProjectsId() {
        return (Integer) getAttributeInternal(PROJECTSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectsId.
     * @param value value to set the ProjectsId
     */
    public void setProjectsId(Integer value) {
        setAttributeInternal(PROJECTSID, value);
    }

    /**
     * Gets the attribute value for BillTypeId, using the alias name BillTypeId.
     * @return the value of BillTypeId
     */
    public Integer getBillTypeId() {
        return (Integer) getAttributeInternal(BILLTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillTypeId.
     * @param value value to set the BillTypeId
     */
    public void setBillTypeId(Integer value) {
        setAttributeInternal(BILLTYPEID, value);
    }

    /**
     * Gets the attribute value for ServicesId, using the alias name ServicesId.
     * @return the value of ServicesId
     */
    public Integer getServicesId() {
        return (Integer) getAttributeInternal(SERVICESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServicesId.
     * @param value value to set the ServicesId
     */
    public void setServicesId(Integer value) {
        setAttributeInternal(SERVICESID, value);
    }

    /**
     * Gets the attribute value for ArInvoiceNo, using the alias name ArInvoiceNo.
     * @return the value of ArInvoiceNo
     */
    public String getArInvoiceNo() {
        return (String) getAttributeInternal(ARINVOICENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArInvoiceNo.
     * @param value value to set the ArInvoiceNo
     */
    public void setArInvoiceNo(String value) {
        setAttributeInternal(ARINVOICENO, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }


    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }


    /**
     * Gets the attribute value for STATUS, using the alias name STATUS.
     * @return the value of STATUS
     */
    public String getSTATUS() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for STATUS.
     * @param value value to set the STATUS
     */
    public void setSTATUS(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * @param accRecInvoicesId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer accRecInvoicesId) {
        return new Key(new Object[] { accRecInvoicesId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setAccRecInvoicesId(am.getDBSequence("SGS_ACC_REC_INVOICES_SEQ"));
            setSTATUS("D");
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

