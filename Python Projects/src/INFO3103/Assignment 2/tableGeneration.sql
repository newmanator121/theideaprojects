DROP TABLE IF EXISTS quote;
CREATE TABLE quote (
  quoteId INT         NOT NULL AUTO_INCREMENT,
  theQuote varchar(255) DEFAULT NULL,
  PRIMARY KEY (quoteId)
);
