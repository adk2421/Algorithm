SELECT
    S_YEAR YEAR,
    S_MONTH MONTH,
    COUNT(*) PUCHASED_USERS,
    ROUND(COUNT(*) / (
        # 전체 회원 수
        SELECT
            COUNT(*)
        FROM
            USER_INFO
        WHERE
            DATE_FORMAT(JOINED, '%Y') = '2021'
    ), 1) PUCHASED_RATIO
FROM
    USER_INFO U
INNER JOIN (
    # 상품 구입 회원 수
    SELECT 
        DISTINCT USER_ID,
        DATE_FORMAT(SALES_DATE, '%Y') S_YEAR,
        DATE_FORMAT(SALES_DATE, '%m') S_MONTH
    FROM
        ONLINE_SALE
    ORDER BY
        USER_ID
    ) O
ON
    U.USER_ID = O.USER_ID
WHERE
    DATE_FORMAT(JOINED, '%Y') = '2021'
GROUP BY
    MONTH
ORDER BY
    YEAR, MONTH