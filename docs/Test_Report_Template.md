# Test Report – Assignment 8: Full Web Application Testing

Website: https://demowebshop.tricentis.com
Tool: Selenium + TestNG (Maven)

---

## 1. Website Selection & Risk Justification

Selected Website: Tricentis Demo Web Shop (demowebshop.tricentis.com)

Description: Public e-commerce demo built on nopCommerce. Includes product catalog, search, registration, login, shopping cart, wishlist, categories, and checkout flows. Suitable for smoke, regression, and automation testing.

Risk-Based Reasoning:

- High risk: Login, registration, add to cart, checkout – critical user flows.
- Medium risk: Search, category navigation, product details – core browsing.
- Lower risk: Newsletter, poll, footer links – supporting features.

---

## 2. Test Strategy

| Strategy   | Approach                                                                  |
| ---------- | ------------------------------------------------------------------------- |
| Smoke      | 10–20 quick checks; core navigation, search, add to cart, login/register. |
| Regression | 25–40 cases; positive, negative, boundary, cross-browser, responsive.     |
| Automation | Selenium + TestNG; 10+ tests (4+ Smoke, 4+ Regression, 2+ Negative).      |

---

## 3. Smoke Testing Results

| Metric       | Result |
| ------------ | ------ |
| Total checks | [15]   |
| Passed       | [15]   |
| Failed       | [0]    |

Summary: All smoke checks passed

---

## 4. Regression Testing Results

Summary: All Regresion Tests passes

---

## 5. Automation Approach & Test Coverage

Tool: Selenium WebDriver, TestNG, WebDriverManager, Maven

Structure:

- `base/BaseTest` – setup, teardown, base URL
- `pages/` – HomePage, LoginPage, ProductPage, RegisterPage
- `tests/` – SmokeTests, RegressionTests, NegativeTests

Automated Tests:

- Smoke: SM01–SM04 (home load, search, add to cart, open login)
- Regression: REG01–REG04 (invalid search, add multiple, sort by price, refresh persistence)
- Negative: NEG01–NEG02 (invalid login, empty search validation)

Execution: `mvn clean test`

## 6. Bug Reports

No bugs found
