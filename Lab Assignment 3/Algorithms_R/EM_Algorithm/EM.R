   EM.R C:\Users\hiren\Desktop\EM.R    '   C:\Users\hiren\AppData\Local\Temp\EM.R "  
library(mclust)
data(wreath)
wreathBIC <- mclustBIC(wreath)
wreathBIC <- mclustBIC(wreath, G = 1:20, x = wreathBIC)
wreathModel <- summary(wreathBIC, data = wreath)
mclust2Dplot(data = wreath, 