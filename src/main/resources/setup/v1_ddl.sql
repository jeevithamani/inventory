CREATE TABLE IF NOT EXISTS inventory
(
    id              BIGSERIAL PRIMARY KEY,
	inventoryReceived           bigint NOT NULL,
    inventoryShipped             bigint,
	inventoryOnHand 	bigint,
    supplier        varchar(200) NOT NULL,
    productName           varchar(200) NOT NULL,
	productLabel 	varchar(1000) NOT NULL
)
