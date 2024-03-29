# -*- coding: utf-8 -*-
"""seeds_unsupervised

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1m_ccmKJkAvxcI8zqKdSt008qJtyKDUNq
"""

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

"""Charytanowicz,Magorzata, Niewczas,Jerzy, Kulczycki,Piotr, Kowalski,Piotr, and Lukasik,Szymon. (2012). seeds. UCI Machine Learning Repository. https://doi.org/10.24432/C5H30K."""

cols = ["area", "perimeter", "compactness", "length", "width", "asymmetry", "groove", "class"]
df = pd.read_csv("seeds_dataset.txt", names=cols, sep="\s+")

for i in range(len(cols)-1):
  for j in range(i+1, len(cols)-1):
    x_label = cols[i]
    y_label = cols[j]
    sns.scatterplot(x=x_label, y=y_label, data=df, hue="class")
    plt.show()

"""#Clustering"""

from sklearn.cluster import KMeans

x = "perimeter"
y = "asymmetry"
X = df[[x, y]].values

kmeans = KMeans(n_clusters = 3).fit(X)

clusters = kmeans.labels_

cluster_df = pd.DataFrame(np.hstack((X, clusters.reshape(-1,1))), columns=[x,y, "class"])

#k-means classes
sns.scatterplot(x=x, y=y, hue="class", data=cluster_df)
plt.plot()

#original classes
sns.scatterplot(x=x, y=y, hue="class", data=df)
plt.plot()

"""#Higher dimensions"""

X = df[cols[:-1]].values

kmeans = KMeans(n_clusters=3).fit(X)

cluster_df = pd.DataFrame(np.hstack((X, clusters.reshape(-1,1))), columns=df.columns)

#k-means classes
sns.scatterplot(x=x, y=y, hue="class", data=cluster_df)
plt.plot()

#original classes
sns.scatterplot(x=x, y=y, hue="class", data=df)
plt.plot()

"""#PCA"""

from sklearn.decomposition import PCA

pca = PCA(n_components=2)
transformed_x = pca.fit_transform(X)

transformed_x[:5]

plt.scatter(transformed_x[:,0], transformed_x[:,1])
plt.show()

kmeans_pca_df = pd.DataFrame(np.hstack((transformed_x, kmeans.labels_.reshape(-1,1))), columns=["pca1", "pca2", "class"])

truth_df = pd.DataFrame(np.hstack((transformed_x, df["class"].values.reshape(-1,1))), columns=["pca1", "pca2", "class"])

#pca classes
sns.scatterplot(x="pca1", y="pca2", hue="class", data=kmeans_pca_df)
plt.plot()

#original classes
sns.scatterplot(x="pca1", y="pca2", hue="class", data=truth_df)
plt.plot()
