# Pandas

pandas is generally imported as pd.

```python
import pandas as pd
pd.DataFrame()
```

pd.DataFrame() is the constructor used to create the data frames. DataFrames are similar to tables.

To create a data frame, the dictionary-list assigns the values to the column labels, but uses ascending count from 0 for row labels.

list of row labels used in a data frame is known as “index”. the labels are assigned to rows using *index* parameter.

```python
pd.DataFrame({'A':[1,2], 'B':[3,4]}, index=['X', 'y'])
```

|  | A | B |
| --- | --- | --- |
| X | 1 | 3 |
| y | 2 | 4 |

## Series

Series is a sequence of data values.

if DataFrame is a table, Series is a list.

```python
pd.Series([1,2,3,4])
```

| 0 | 1 |
| --- | --- |
| 1 | 2 |
| 2 | 3 |
| 3 | 4 |

a Series is basically a single column of a DataFrame. row labels can be assigned to the series using *********index********* parameter.

```python
pd.Series([1,2,3], index=['A','B','C'], name='anyname')
```

| A | 1 |
| --- | --- |
| B | 2 |
| C | 3 |
| name: anyname |  |

pd.read_csv() can be used to read a csv file into a DataFrame.

```python
ffts = pd.read_csv("...path")
```

to check how large the resulting DataFrame is,  .shape() is used.

```python
ffts.shape()
```

.head() can display the first five rows in the data frame.

```python
ffts.head()
```

*********index_col********* parameter to use a column as index.

.to_csv() function is used to save DataFrame as a csv file.

```python
ffts.to_csv("file_name.csv")
```

specific columns and data can be accessed using “ . ” and indexing “[ ]”.

```python
ffts.fstCol
ffts["fstCol"]
```

considering “fstCol” is the first column in the dataframe, the above lines display the first column in the dataframe “ffts”.

```python
ffts["fstCol"][0]
```

gives the first value in the first column of the DataFrame


## summary functions

```python
datafarame_name.column_name.describe()
```

```describe()``` method generates a high-level summary of the attributes of the given column.

It is “type aware” meaning that its output changes based on the datatypes of the input.

pandas has a lot of helpful functions to get some simple summary statistic about a column in a DataFrame or a series.

to get mean, 

```python
dataframe_name.column_name.mean()
```

to get list of unique values,

```python
dataframe_name.column_name.unique()
```

to see a list of unique values and how often they occur in the dataset,

```python
dataframe_name.column_name.value_counts()
```


## Maps

maps are often used for creating new representation from the existing data, or for transforming data from the format it is in now to the format that we want it to be in later, which makes them extremely important.

two mapping methods are often used:

```map()``` and ```apply()```

```apply()``` is equivalent method if we want to transform a whole DataFrame by calling a custom method on each row. 

```map()``` returns new transformed series.

```apply()``` returns new transformed DataFrame.
