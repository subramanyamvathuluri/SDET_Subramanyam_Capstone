# This is a sample Python script.
import time

import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By


def test_2():
    driver = webdriver.Chrome()
    driver.get("https://www.saucedemo.com/")
    driver.maximize_window()

    element = driver.find_element(By.XPATH, '//*[@id="root"]/div/div[1]')
    assert (element.text == "Swag Labs")
    time.sleep(3)

    username = driver.find_element(By.XPATH, '/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input')
    username.send_keys('standard_user')
    time.sleep(3)
    password = driver.find_element(By.XPATH, '/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input')
    password.send_keys('secret_sauce')
    time.sleep(2)
    login = driver.find_element(By.XPATH, '/html/body/div/div/div[2]/div[1]/div/div/form/input')
    login.click()
    time.sleep(2)

    tshirt = driver.find_element(By.XPATH, '/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button')
    tshirt.click()
    time.sleep(3)

    cart = driver.find_element(By.XPATH, '/html/body/div/div/div/div[1]/div[1]/div[3]/a')
    cart.click()
    time.sleep(2)

    button = driver.find_element(By.XPATH, '/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button')
    button.click();
    time.sleep(2)

    logout = driver.find_element(By.XPATH, '/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]')
    logout.click()
    time.sleep(2)
