-- Table for buying questions

SHOW TABLES;
SELECT * FROM data_analysis;
CREATE TABLE buying_questions (
    buy_id INT AUTO_INCREMENT PRIMARY KEY,
    now_price FLOAT,
    news_status VARCHAR(255),
    support_price FLOAT,
    rsi_data INT,
    bollinger_bands_position VARCHAR(255),
    dataTime VARCHAR(255)
);

-- Table for selling questions
CREATE TABLE selling_questions (
    sell_id INT AUTO_INCREMENT PRIMARY KEY,
    now_price FLOAT,
    news_status VARCHAR(255),
    resistance_price FLOAT,
    bollinger_bands_position VARCHAR(255),
    result VARCHAR(255),
    dataTime VARCHAR(255)
);

-- Table for data analysis
CREATE TABLE data_analysis (
    analysis_id INT AUTO_INCREMENT PRIMARY KEY,
    buy_id INT,
    sell_id INT,
    win_status VARCHAR(255),
    FOREIGN KEY (buy_id) REFERENCES buying_questions(buy_id),
    FOREIGN KEY (sell_id) REFERENCES selling_questions(sell_id)
);
