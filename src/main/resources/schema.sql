
CREATE TABLE CUSTOMER_ORDERS (
    order_Number int NOT NULL,
    customer_Name varchar NOT NULL,
    checkout_Time_Stamp varchar NOT NULL,
    return_Time_Stamp varchar,
    estimated_Return_Date varchar NOT NULL,
    equipment_ID varchar NOT NULL,
    location_ID varchar NOT NULL,
    price decimal NOT NULL,

);