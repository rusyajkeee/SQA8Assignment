# Test Report – Assignment 8: Full Web Application Testing

**Website:** https://demowebshop.tricentis.com
**Tool:** Selenium + TestNG (Maven)

---

## 1. Website Selection & Risk Justification

**Selected Website:** Tricentis Demo Web Shop (demowebshop.tricentis.com)

**Description:** Public e-commerce demo built on nopCommerce. Includes product catalog, search, registration, login, shopping cart, wishlist, categories, and checkout flows. Suitable for smoke, regression, and automation testing.

**Risk-Based Reasoning:**

- **High risk:** Login, registration, add to cart, checkout – critical user flows.
- **Medium risk:** Search, category navigation, product details – core browsing.
- **Lower risk:** Newsletter, poll, footer links – supporting features.

---

## 2. Test Strategy

| Strategy   | Approach                                                                  |
| ---------- | ------------------------------------------------------------------------- |
| Smoke      | 10–20 quick checks; core navigation, search, add to cart, login/register. |
| Regression | 25–40 cases; positive, negative, boundary, cross-browser, responsive.     |
| Automation | Selenium + TestNG; 10+ tests (4+ Smoke, 4+ Regression, 2+ Negative).      |

---

## 3. Smoke Testing Results

| Metric       | Result    |
| ------------ | --------- |
| Total checks | [e.g. 15] |
| Passed       | [X]       |
| Failed       | [X]       |
| Blocked      | [X]       |

**Summary:** [Brief description – e.g. "All smoke checks passed; application ready for regression."]

---

## 4. Regression Testing Results

| Category      | Total   | Passed  | Failed  |
| ------------- | ------- | ------- | ------- |
| Positive      | [X]     | [X]     | [X]     |
| Negative      | [X]     | [X]     | [X]     |
| Boundary      | [X]     | [X]     | [X]     |
| Cross-Browser | [X]     | [X]     | [X]     |
| Responsive    | [X]     | [X]     | [X]     |
| **Total**     | **[X]** | **[X]** | **[X]** |

**Summary:** [Brief description of regression results.]

---

## 5. Automation Approach & Test Coverage

**Tool:** Selenium WebDriver 4.x, TestNG, WebDriverManager, Maven

**Structure:**

- `base/BaseTest` – setup, teardown, base URL
- `pages/` – HomePage, LoginPage, ProductPage, RegisterPage
- `tests/` – SmokeTests, RegressionTests, NegativeTests

**Automated Tests:**

- Smoke: SM01–SM06 (home load, search, add to cart, login, register, cart)
- Regression: REG01–REG06 (invalid search, add multiple, sort, refresh, categories, product details)
- Negative: NEG01–NEG03 (invalid login, empty search, invalid email format)

**Execution:** `mvn clean test`

---

## 6. Execution Logs & HTML Report

- **Execution logs:** `target/surefire-reports/` (text and XML)
- **HTML report:** `target/surefire-reports/emailable-report.html` or `index.html`

---

## 7. Conclusions & Quality Assessment

**Conclusions:**
[Summarize: Did tests pass? Any critical issues?]

**Quality Assessment:**
[Overall assessment – e.g. "Application appears stable for core flows; minor issues noted in [area]."]

---

## 8. Bug Reports

See separate Bug Report document. If no defects found: **"No bugs found"** with brief explanation.
