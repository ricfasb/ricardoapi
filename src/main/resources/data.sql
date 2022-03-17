INSERT INTO pessoa (nome, idade, foto, email, celular) 
SELECT 'Ricardo Silva de Souza', 37, '', 'ricardosouzatdf@gmail.com', '(41) 99735-6298'
 WHERE NOT EXISTS (SELECT 1 
                     FROM pessoa p
                    WHERE p.email = 'ricardosouzatdf@gmail.com') 