import numpy as np
import matplotlib.pyplot as plt


def sigmoidFunc(a):
    return 1/(1 + np.exp(-a))

W = [w1, w2, w3, ]

nowlayer = 0
layerNum = 4
while nowlayer <= layerNum:
    