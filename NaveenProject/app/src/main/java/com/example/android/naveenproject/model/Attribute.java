package com.example.android.naveenproject.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ramesh on 27/7/18.
 */

public class Attribute {


    @SerializedName("payment-type")
    private String payment_type;
    private String title;
    @SerializedName("first-name")
    private String first_name;
    @SerializedName("last-name")
    private String last_name;
    @SerializedName("date-of-birth")
    private String date_of_birth;
    @SerializedName("contact-number")
    private String contact_number;
    @SerializedName("email-address")
    private String email_address;
    @SerializedName("email-address-verified")
    private boolean email_address_verified;
    @SerializedName("email-subscription-status")
    private boolean email_subscription_status;


    @SerializedName("included-data-balance")
    private int included_data_balance;
    @SerializedName("expiry-date")
    private String expiry_date;
    @SerializedName("auto-renewal")
    private boolean auto_renewal;
    @SerializedName("primary-subscription")
    private boolean primary_subscription;
    private String name;
    @SerializedName("unlimited-text")
    private boolean unlimited_text;
    @SerializedName("unlimited-talk")
    private boolean unlimited_talk;
    @SerializedName("unlimited-international-text")
    private boolean unlimited_international_text;
    @SerializedName("unlimited-international-talk")
    private boolean unlimited_international_talk;
    private int price;

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public boolean isEmail_address_verified() {
        return email_address_verified;
    }

    public void setEmail_address_verified(boolean email_address_verified) {
        this.email_address_verified = email_address_verified;
    }

    public boolean isEmail_subscription_status() {
        return email_subscription_status;
    }

    public void setEmail_subscription_status(boolean email_subscription_status) {
        this.email_subscription_status = email_subscription_status;
    }

    public int getIncluded_data_balance() {
        return included_data_balance;
    }

    public void setIncluded_data_balance(int included_data_balance) {
        this.included_data_balance = included_data_balance;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public boolean isAuto_renewal() {
        return auto_renewal;
    }

    public void setAuto_renewal(boolean auto_renewal) {
        this.auto_renewal = auto_renewal;
    }

    public boolean isPrimary_subscription() {
        return primary_subscription;
    }

    public void setPrimary_subscription(boolean primary_subscription) {
        this.primary_subscription = primary_subscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUnlimited_text() {
        return unlimited_text;
    }

    public void setUnlimited_text(boolean unlimited_text) {
        this.unlimited_text = unlimited_text;
    }

    public boolean isUnlimited_talk() {
        return unlimited_talk;
    }

    public void setUnlimited_talk(boolean unlimited_talk) {
        this.unlimited_talk = unlimited_talk;
    }

    public boolean isUnlimited_international_text() {
        return unlimited_international_text;
    }

    public void setUnlimited_international_text(boolean unlimited_international_text) {
        this.unlimited_international_text = unlimited_international_text;
    }

    public boolean isUnlimited_international_talk() {
        return unlimited_international_talk;
    }

    public void setUnlimited_international_talk(boolean unlimited_international_talk) {
        this.unlimited_international_talk = unlimited_international_talk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Attribute{" +
                "payment_type='" + payment_type + '\'' +
                ", title='" + title + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", contact_number='" + contact_number + '\'' +
                ", email_address='" + email_address + '\'' +
                ", email_address_verified=" + email_address_verified +
                ", email_subscription_status=" + email_subscription_status +
                ", included_data_balance=" + included_data_balance +
                ", expiry_date='" + expiry_date + '\'' +
                ", auto_renewal=" + auto_renewal +
                ", primary_subscription=" + primary_subscription +
                ", name='" + name + '\'' +
                ", unlimited_text=" + unlimited_text +
                ", unlimited_talk=" + unlimited_talk +
                ", unlimited_international_text=" + unlimited_international_text +
                ", unlimited_international_talk=" + unlimited_international_talk +
                ", price=" + price +
                '}';
    }
}
