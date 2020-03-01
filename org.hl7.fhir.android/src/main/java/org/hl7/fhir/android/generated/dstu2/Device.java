package org.hl7.fhir.android.generated.dstu2;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DeviceEnum.DeviceStatus;
import org.hl7.fhir.android.generated.dstu2.DeviceEnum.DeviceStatusEnumFactory;

/**
 * This resource identifies an instance of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices includes durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc.
 */
public class Device extends DomainResource {

    /**
     * Unique instance identifiers assigned to a device by organizations like manufacturers or owners. If the identifier identifies the type of device, Device.type should be used.
     */
    protected List<Identifier> identifier;

    /**
     * Code or identifier to identify a kind of device.
     */
    protected CodeableConcept type;

    /**
     * Descriptive information, usage information or implantation information that is not captured in an existing element.
     */
    protected List<Annotation> note;

    /**
     * Status of the Device availability.
     */
    protected Enumeration<DeviceStatus> status;

    /**
     * A name of the manufacturer.
     */
    protected StringType manufacturer;

    /**
     * The "model" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.
     */
    protected StringType model;

    /**
     * The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.
     */
    protected StringType version;

    /**
     * The date and time when the device was manufactured.
     */
    protected DateTimeType manufactureDate;

    /**
     * The date and time beyond which this device is no longer valid or should not be used (if applicable).
     */
    protected DateTimeType expiry;

    /**
     * United States Food and Drug Administration mandated Unique Device Identifier (UDI). Use the human readable information (the content that the user sees, which is sometimes different to the exact syntax represented in the barcode)  - see http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/default.htm.
     */
    protected StringType udi;

    /**
     * Lot number assigned by the manufacturer.
     */
    protected StringType lotNumber;

    /**
     * An organization that is responsible for the provision and ongoing maintenance of the device.
     */
    protected Reference owner;

    /**
     * The actual object that is the target of the reference (An organization that is responsible for the provision and ongoing maintenance of the device.)
     */
    protected Organization ownerTarget;

    /**
     * The place where the device can be found.
     */
    protected Reference location;

    /**
     * The actual object that is the target of the reference (The place where the device can be found.)
     */
    protected Location locationTarget;

    /**
     * Patient information, if the resource is affixed to a person.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (Patient information, if the resource is affixed to a person.)
     */
    protected Patient patientTarget;

    /**
     * Contact details for an organization or a particular human that is responsible for the device.
     */
    protected List<ContactPoint> contact;

    /**
     * A network address on which the device may be contacted directly.
     */
    protected UriType url;

    private static final long serialVersionUID = 366690094L;

    /*
   * Constructor
   */
    public Device() {
        super();
    }

    /*
   * Constructor
   */
    public Device(CodeableConcept type) {
        super();
        this.type = type;
    }

    /**
     * @return {@link #identifier} (Unique instance identifiers assigned to a device by organizations like manufacturers or owners. If the identifier identifies the type of device, Device.type should be used.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #identifier} (Unique instance identifiers assigned to a device by organizations like manufacturers or owners. If the identifier identifies the type of device, Device.type should be used.)
     */
    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public Device addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #type} (Code or identifier to identify a kind of device.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Code or identifier to identify a kind of device.)
     */
    public Device setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #note} (Descriptive information, usage information or implantation information that is not captured in an existing element.)
     */
    public List<Annotation> getNote() {
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        return this.note;
    }

    public boolean hasNote() {
        if (this.note == null)
            return false;
        for (Annotation item : this.note) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #note} (Descriptive information, usage information or implantation information that is not captured in an existing element.)
     */
    // syntactic sugar
    public Annotation addNote() {
        // 3
        Annotation t = new Annotation();
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        this.note.add(t);
        return t;
    }

    // syntactic sugar
    public Device addNote(Annotation t) {
        // 3
        if (t == null)
            return this;
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        this.note.add(t);
        return this;
    }

    /**
     * @return {@link #status} (Status of the Device availability.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DeviceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<DeviceStatus>(new DeviceStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Status of the Device availability.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Device setStatusElement(Enumeration<DeviceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Status of the Device availability.
     */
    public DeviceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Status of the Device availability.
     */
    public Device setStatus(DeviceStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<DeviceStatus>(new DeviceStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #manufacturer} (A name of the manufacturer.). This is the underlying object with id, value and extensions. The accessor "getManufacturer" gives direct access to the value
     */
    public StringType getManufacturerElement() {
        if (this.manufacturer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.manufacturer");
            else if (Configuration.doAutoCreate())
                // bb
                this.manufacturer = new StringType();
        return this.manufacturer;
    }

    public boolean hasManufacturerElement() {
        return this.manufacturer != null && !this.manufacturer.isEmpty();
    }

    public boolean hasManufacturer() {
        return this.manufacturer != null && !this.manufacturer.isEmpty();
    }

    /**
     * @param value {@link #manufacturer} (A name of the manufacturer.). This is the underlying object with id, value and extensions. The accessor "getManufacturer" gives direct access to the value
     */
    public Device setManufacturerElement(StringType value) {
        this.manufacturer = value;
        return this;
    }

    /**
     * @return A name of the manufacturer.
     */
    public String getManufacturer() {
        return this.manufacturer == null ? null : this.manufacturer.getValue();
    }

    /**
     * @param value A name of the manufacturer.
     */
    public Device setManufacturer(String value) {
        if (Utilities.noString(value))
            this.manufacturer = null;
        else {
            if (this.manufacturer == null)
                this.manufacturer = new StringType();
            this.manufacturer.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #model} (The "model" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.). This is the underlying object with id, value and extensions. The accessor "getModel" gives direct access to the value
     */
    public StringType getModelElement() {
        if (this.model == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.model");
            else if (Configuration.doAutoCreate())
                // bb
                this.model = new StringType();
        return this.model;
    }

    public boolean hasModelElement() {
        return this.model != null && !this.model.isEmpty();
    }

    public boolean hasModel() {
        return this.model != null && !this.model.isEmpty();
    }

    /**
     * @param value {@link #model} (The "model" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.). This is the underlying object with id, value and extensions. The accessor "getModel" gives direct access to the value
     */
    public Device setModelElement(StringType value) {
        this.model = value;
        return this;
    }

    /**
     * @return The "model" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.
     */
    public String getModel() {
        return this.model == null ? null : this.model.getValue();
    }

    /**
     * @param value The "model" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.
     */
    public Device setModel(String value) {
        if (Utilities.noString(value))
            this.model = null;
        else {
            if (this.model == null)
                this.model = new StringType();
            this.model.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #version} (The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.version");
            else if (Configuration.doAutoCreate())
                // bb
                this.version = new StringType();
        return this.version;
    }

    public boolean hasVersionElement() {
        return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() {
        return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public Device setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.
     */
    public Device setVersion(String value) {
        if (Utilities.noString(value))
            this.version = null;
        else {
            if (this.version == null)
                this.version = new StringType();
            this.version.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #manufactureDate} (The date and time when the device was manufactured.). This is the underlying object with id, value and extensions. The accessor "getManufactureDate" gives direct access to the value
     */
    public DateTimeType getManufactureDateElement() {
        if (this.manufactureDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.manufactureDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.manufactureDate = new DateTimeType();
        return this.manufactureDate;
    }

    public boolean hasManufactureDateElement() {
        return this.manufactureDate != null && !this.manufactureDate.isEmpty();
    }

    public boolean hasManufactureDate() {
        return this.manufactureDate != null && !this.manufactureDate.isEmpty();
    }

    /**
     * @param value {@link #manufactureDate} (The date and time when the device was manufactured.). This is the underlying object with id, value and extensions. The accessor "getManufactureDate" gives direct access to the value
     */
    public Device setManufactureDateElement(DateTimeType value) {
        this.manufactureDate = value;
        return this;
    }

    /**
     * @return The date and time when the device was manufactured.
     */
    public Date getManufactureDate() {
        return this.manufactureDate == null ? null : this.manufactureDate.getValue();
    }

    /**
     * @param value The date and time when the device was manufactured.
     */
    public Device setManufactureDate(Date value) {
        if (value == null)
            this.manufactureDate = null;
        else {
            if (this.manufactureDate == null)
                this.manufactureDate = new DateTimeType();
            this.manufactureDate.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #expiry} (The date and time beyond which this device is no longer valid or should not be used (if applicable).). This is the underlying object with id, value and extensions. The accessor "getExpiry" gives direct access to the value
     */
    public DateTimeType getExpiryElement() {
        if (this.expiry == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.expiry");
            else if (Configuration.doAutoCreate())
                // bb
                this.expiry = new DateTimeType();
        return this.expiry;
    }

    public boolean hasExpiryElement() {
        return this.expiry != null && !this.expiry.isEmpty();
    }

    public boolean hasExpiry() {
        return this.expiry != null && !this.expiry.isEmpty();
    }

    /**
     * @param value {@link #expiry} (The date and time beyond which this device is no longer valid or should not be used (if applicable).). This is the underlying object with id, value and extensions. The accessor "getExpiry" gives direct access to the value
     */
    public Device setExpiryElement(DateTimeType value) {
        this.expiry = value;
        return this;
    }

    /**
     * @return The date and time beyond which this device is no longer valid or should not be used (if applicable).
     */
    public Date getExpiry() {
        return this.expiry == null ? null : this.expiry.getValue();
    }

    /**
     * @param value The date and time beyond which this device is no longer valid or should not be used (if applicable).
     */
    public Device setExpiry(Date value) {
        if (value == null)
            this.expiry = null;
        else {
            if (this.expiry == null)
                this.expiry = new DateTimeType();
            this.expiry.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #udi} (United States Food and Drug Administration mandated Unique Device Identifier (UDI). Use the human readable information (the content that the user sees, which is sometimes different to the exact syntax represented in the barcode)  - see http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/default.htm.). This is the underlying object with id, value and extensions. The accessor "getUdi" gives direct access to the value
     */
    public StringType getUdiElement() {
        if (this.udi == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.udi");
            else if (Configuration.doAutoCreate())
                // bb
                this.udi = new StringType();
        return this.udi;
    }

    public boolean hasUdiElement() {
        return this.udi != null && !this.udi.isEmpty();
    }

    public boolean hasUdi() {
        return this.udi != null && !this.udi.isEmpty();
    }

    /**
     * @param value {@link #udi} (United States Food and Drug Administration mandated Unique Device Identifier (UDI). Use the human readable information (the content that the user sees, which is sometimes different to the exact syntax represented in the barcode)  - see http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/default.htm.). This is the underlying object with id, value and extensions. The accessor "getUdi" gives direct access to the value
     */
    public Device setUdiElement(StringType value) {
        this.udi = value;
        return this;
    }

    /**
     * @return United States Food and Drug Administration mandated Unique Device Identifier (UDI). Use the human readable information (the content that the user sees, which is sometimes different to the exact syntax represented in the barcode)  - see http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/default.htm.
     */
    public String getUdi() {
        return this.udi == null ? null : this.udi.getValue();
    }

    /**
     * @param value United States Food and Drug Administration mandated Unique Device Identifier (UDI). Use the human readable information (the content that the user sees, which is sometimes different to the exact syntax represented in the barcode)  - see http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/default.htm.
     */
    public Device setUdi(String value) {
        if (Utilities.noString(value))
            this.udi = null;
        else {
            if (this.udi == null)
                this.udi = new StringType();
            this.udi.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #lotNumber} (Lot number assigned by the manufacturer.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
     */
    public StringType getLotNumberElement() {
        if (this.lotNumber == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.lotNumber");
            else if (Configuration.doAutoCreate())
                // bb
                this.lotNumber = new StringType();
        return this.lotNumber;
    }

    public boolean hasLotNumberElement() {
        return this.lotNumber != null && !this.lotNumber.isEmpty();
    }

    public boolean hasLotNumber() {
        return this.lotNumber != null && !this.lotNumber.isEmpty();
    }

    /**
     * @param value {@link #lotNumber} (Lot number assigned by the manufacturer.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
     */
    public Device setLotNumberElement(StringType value) {
        this.lotNumber = value;
        return this;
    }

    /**
     * @return Lot number assigned by the manufacturer.
     */
    public String getLotNumber() {
        return this.lotNumber == null ? null : this.lotNumber.getValue();
    }

    /**
     * @param value Lot number assigned by the manufacturer.
     */
    public Device setLotNumber(String value) {
        if (Utilities.noString(value))
            this.lotNumber = null;
        else {
            if (this.lotNumber == null)
                this.lotNumber = new StringType();
            this.lotNumber.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #owner} (An organization that is responsible for the provision and ongoing maintenance of the device.)
     */
    public Reference getOwner() {
        if (this.owner == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.owner");
            else if (Configuration.doAutoCreate())
                // cc
                this.owner = new Reference();
        return this.owner;
    }

    public boolean hasOwner() {
        return this.owner != null && !this.owner.isEmpty();
    }

    /**
     * @param value {@link #owner} (An organization that is responsible for the provision and ongoing maintenance of the device.)
     */
    public Device setOwner(Reference value) {
        this.owner = value;
        return this;
    }

    /**
     * @return {@link #owner} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (An organization that is responsible for the provision and ongoing maintenance of the device.)
     */
    public Organization getOwnerTarget() {
        if (this.ownerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.owner");
            else if (Configuration.doAutoCreate())
                // aa
                this.ownerTarget = new Organization();
        return this.ownerTarget;
    }

    /**
     * @param value {@link #owner} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (An organization that is responsible for the provision and ongoing maintenance of the device.)
     */
    public Device setOwnerTarget(Organization value) {
        this.ownerTarget = value;
        return this;
    }

    /**
     * @return {@link #location} (The place where the device can be found.)
     */
    public Reference getLocation() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.location");
            else if (Configuration.doAutoCreate())
                // cc
                this.location = new Reference();
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (The place where the device can be found.)
     */
    public Device setLocation(Reference value) {
        this.location = value;
        return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The place where the device can be found.)
     */
    public Location getLocationTarget() {
        if (this.locationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.location");
            else if (Configuration.doAutoCreate())
                // aa
                this.locationTarget = new Location();
        return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The place where the device can be found.)
     */
    public Device setLocationTarget(Location value) {
        this.locationTarget = value;
        return this;
    }

    /**
     * @return {@link #patient} (Patient information, if the resource is affixed to a person.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (Patient information, if the resource is affixed to a person.)
     */
    public Device setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Patient information, if the resource is affixed to a person.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Patient information, if the resource is affixed to a person.)
     */
    public Device setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #contact} (Contact details for an organization or a particular human that is responsible for the device.)
     */
    public List<ContactPoint> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<ContactPoint>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (ContactPoint item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contact details for an organization or a particular human that is responsible for the device.)
     */
    // syntactic sugar
    public ContactPoint addContact() {
        // 3
        ContactPoint t = new ContactPoint();
        if (this.contact == null)
            this.contact = new ArrayList<ContactPoint>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public Device addContact(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<ContactPoint>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #url} (A network address on which the device may be contacted directly.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Device.url");
            else if (Configuration.doAutoCreate())
                // bb
                this.url = new UriType();
        return this.url;
    }

    public boolean hasUrlElement() {
        return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() {
        return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (A network address on which the device may be contacted directly.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public Device setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return A network address on which the device may be contacted directly.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value A network address on which the device may be contacted directly.
     */
    public Device setUrl(String value) {
        if (Utilities.noString(value))
            this.url = null;
        else {
            if (this.url == null)
                this.url = new UriType();
            this.url.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Unique instance identifiers assigned to a device by organizations like manufacturers or owners. If the identifier identifies the type of device, Device.type should be used.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("type", "CodeableConcept", "Code or identifier to identify a kind of device.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("note", "Annotation", "Descriptive information, usage information or implantation information that is not captured in an existing element.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("status", "code", "Status of the Device availability.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("manufacturer", "string", "A name of the manufacturer.", 0, java.lang.Integer.MAX_VALUE, manufacturer));
        childrenList.add(new Property("model", "string", "The \"model\" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.", 0, java.lang.Integer.MAX_VALUE, model));
        childrenList.add(new Property("version", "string", "The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("manufactureDate", "dateTime", "The date and time when the device was manufactured.", 0, java.lang.Integer.MAX_VALUE, manufactureDate));
        childrenList.add(new Property("expiry", "dateTime", "The date and time beyond which this device is no longer valid or should not be used (if applicable).", 0, java.lang.Integer.MAX_VALUE, expiry));
        childrenList.add(new Property("udi", "string", "United States Food and Drug Administration mandated Unique Device Identifier (UDI). Use the human readable information (the content that the user sees, which is sometimes different to the exact syntax represented in the barcode)  - see http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/default.htm.", 0, java.lang.Integer.MAX_VALUE, udi));
        childrenList.add(new Property("lotNumber", "string", "Lot number assigned by the manufacturer.", 0, java.lang.Integer.MAX_VALUE, lotNumber));
        childrenList.add(new Property("owner", "Reference(Organization)", "An organization that is responsible for the provision and ongoing maintenance of the device.", 0, java.lang.Integer.MAX_VALUE, owner));
        childrenList.add(new Property("location", "Reference(Location)", "The place where the device can be found.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("patient", "Reference(Patient)", "Patient information, if the resource is affixed to a person.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("contact", "ContactPoint", "Contact details for an organization or a particular human that is responsible for the device.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("url", "uri", "A network address on which the device may be contacted directly.", 0, java.lang.Integer.MAX_VALUE, url));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("note"))
            this.getNote().add(castToAnnotation(value));
        else if (name.equals("status"))
            // Enumeration<DeviceStatus>
            this.status = new DeviceStatusEnumFactory().fromType(value);
        else if (name.equals("manufacturer"))
            // StringType
            this.manufacturer = castToString(value);
        else if (name.equals("model"))
            // StringType
            this.model = castToString(value);
        else if (name.equals("version"))
            // StringType
            this.version = castToString(value);
        else if (name.equals("manufactureDate"))
            // DateTimeType
            this.manufactureDate = castToDateTime(value);
        else if (name.equals("expiry"))
            // DateTimeType
            this.expiry = castToDateTime(value);
        else if (name.equals("udi"))
            // StringType
            this.udi = castToString(value);
        else if (name.equals("lotNumber"))
            // StringType
            this.lotNumber = castToString(value);
        else if (name.equals("owner"))
            // Reference
            this.owner = castToReference(value);
        else if (name.equals("location"))
            // Reference
            this.location = castToReference(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("contact"))
            this.getContact().add(castToContactPoint(value));
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("note")) {
            return addNote();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.status");
        } else if (name.equals("manufacturer")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.manufacturer");
        } else if (name.equals("model")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.model");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.version");
        } else if (name.equals("manufactureDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.manufactureDate");
        } else if (name.equals("expiry")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.expiry");
        } else if (name.equals("udi")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.udi");
        } else if (name.equals("lotNumber")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.lotNumber");
        } else if (name.equals("owner")) {
            this.owner = new Reference();
            return this.owner;
        } else if (name.equals("location")) {
            this.location = new Reference();
            return this.location;
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type Device.url");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Device";
    }

    public Device copy() {
        Device dst = new Device();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.type = type == null ? null : type.copy();
        if (note != null) {
            dst.note = new ArrayList<Annotation>();
            for (Annotation i : note) dst.note.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.manufacturer = manufacturer == null ? null : manufacturer.copy();
        dst.model = model == null ? null : model.copy();
        dst.version = version == null ? null : version.copy();
        dst.manufactureDate = manufactureDate == null ? null : manufactureDate.copy();
        dst.expiry = expiry == null ? null : expiry.copy();
        dst.udi = udi == null ? null : udi.copy();
        dst.lotNumber = lotNumber == null ? null : lotNumber.copy();
        dst.owner = owner == null ? null : owner.copy();
        dst.location = location == null ? null : location.copy();
        dst.patient = patient == null ? null : patient.copy();
        if (contact != null) {
            dst.contact = new ArrayList<ContactPoint>();
            for (ContactPoint i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.url = url == null ? null : url.copy();
        return dst;
    }

    protected Device typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Device))
            return false;
        Device o = (Device) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true) && compareDeep(note, o.note, true) && compareDeep(status, o.status, true) && compareDeep(manufacturer, o.manufacturer, true) && compareDeep(model, o.model, true) && compareDeep(version, o.version, true) && compareDeep(manufactureDate, o.manufactureDate, true) && compareDeep(expiry, o.expiry, true) && compareDeep(udi, o.udi, true) && compareDeep(lotNumber, o.lotNumber, true) && compareDeep(owner, o.owner, true) && compareDeep(location, o.location, true) && compareDeep(patient, o.patient, true) && compareDeep(contact, o.contact, true) && compareDeep(url, o.url, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Device))
            return false;
        Device o = (Device) other;
        return compareValues(status, o.status, true) && compareValues(manufacturer, o.manufacturer, true) && compareValues(model, o.model, true) && compareValues(version, o.version, true) && compareValues(manufactureDate, o.manufactureDate, true) && compareValues(expiry, o.expiry, true) && compareValues(udi, o.udi, true) && compareValues(lotNumber, o.lotNumber, true) && compareValues(url, o.url, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (type == null || type.isEmpty()) && (note == null || note.isEmpty()) && (status == null || status.isEmpty()) && (manufacturer == null || manufacturer.isEmpty()) && (model == null || model.isEmpty()) && (version == null || version.isEmpty()) && (manufactureDate == null || manufactureDate.isEmpty()) && (expiry == null || expiry.isEmpty()) && (udi == null || udi.isEmpty()) && (lotNumber == null || lotNumber.isEmpty()) && (owner == null || owner.isEmpty()) && (location == null || location.isEmpty()) && (patient == null || patient.isEmpty()) && (contact == null || contact.isEmpty()) && (url == null || url.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Device;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PATIENT = "patient";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_MODEL = "model";

    public static final String SP_LOCATION = "location";

    public static final String SP_UDI = "udi";

    public static final String SP_TYPE = "type";

    public static final String SP_URL = "url";

    public static final String SP_MANUFACTURER = "manufacturer";
}
