#!/usr/bin/env python
# coding: utf-8

# In[ ]:


def SumaGrupo(start, nums, target):
    if (start == len(nums)):
        return target == 0
    else:
        usar = Suma_grupo(start+1, nums, target-nums[start])
        noUsar = Suma_grupo(start+1, nums, target)
        return usar or noUsar

