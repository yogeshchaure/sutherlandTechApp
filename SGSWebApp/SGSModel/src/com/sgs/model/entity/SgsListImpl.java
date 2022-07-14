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
// ---    Fri May 21 12:52:00 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsListImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ListId,
        Name,
        Discription,
        Type,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy;
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
    public static final int LISTID = AttributesEnum.ListId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int DISCRIPTION = AttributesEnum.Discription.index();
    public static final int TYPE = AttributesEnum.Type.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsListImpl.class);

    /**
     * This is the default constructor (do not remove).
     */
    public SgsListImpl() {
    }

    /**
     * Gets the attribute value for ListId, using the alias name ListId.
     * @return the value of ListId
     */
    public Integer getListId() {
        return (Integer) getAttributeInternal(LISTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ListId.
     * @param value value to set the ListId
     */
    public void setListId(Integer value) {
        setAttributeInternal(LISTID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for Discription, using the alias name Discription.
     * @return the value of Discription
     */
    public String getDiscription() {
        return (String) getAttributeInternal(DISCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Discription.
     * @param value value to set the Discription
     */
    public void setDiscription(String value) {
        setAttributeInternal(DISCRIPTION, value);
    }

    /**
     * Gets the attribute value for Type, using the alias name Type.
     * @return the value of Type
     */
    public String getType() {
        return (String) getAttributeInternal(TYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Type.
     * @param value value to set the Type
     */
    public void setType(String value) {
        setAttributeInternal(TYPE, value);
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
     * @param listId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer listId) {
        return new Key(new Object[] { listId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsList");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setListId(am.getDBSequence("SGS_LIST_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

