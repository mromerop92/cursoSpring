CREATE TABLE [dbo].[PRESTAMO_MOISES_ROMERO](
	[N_ID_REGISTRO] [smallint] IDENTITY(1,1) NOT NULL,
	[N_CVE_PRESTAMO] [int] NOT NULL,
	[N_TIPO] [tinyint] NOT NULL,
	[DESCRIPCION] [VARCHAR](50) NULL,
 CONSTRAINT [PK_PRESTAMO_MOISES_ROMERO] PRIMARY KEY CLUSTERED 
(
[N_ID_REGISTRO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON,
ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


